import br.com.dio.desafio.dominio.Curso;
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
        curso2.setCargaHoraria(16);

        mentoria1.setTitulo("Mentoria do Curso Java");
        mentoria1.setDescricao("Descrição da mentoria do Curso Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}