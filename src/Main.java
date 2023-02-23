import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do 'Curso Java'");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("descrição do 'Curso SQL'");
        curso2.setCargaHoraria(10);

        mentoria1.setTitulo("Mentoria do Curso Java");
        mentoria1.setDescricao("Descrição da mentoria do Curso Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer Banco Pan");
        bootcamp.setDescricao("Descrição do bootcamnp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("==========================================");
        Dev dev1 = new Dev();
        dev1.setNome("Marcelo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Progredindo...");
        dev1.progredir();
        System.out.println("Conteúdos Inscritos por " + dev1.getNome() + " após a progressão: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP após progressão: " + dev1.calcularTotalXp());
        System.out.println("==========================================");

        System.out.println("\n==========================================");
        Dev dev2 = new Dev();
        dev2.setNome("Aline");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("Progredindo...");
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos por " + dev2.getNome() + " após a progressão: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP após progressão: " + dev2.calcularTotalXp());
        System.out.println("==========================================");
    }
}