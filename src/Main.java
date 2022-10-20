import Dominio.Curso;
import Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java Básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Javascript Básico");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso PostgreSQL");
        curso3.setDescricao("PostgreSQL Básico");
        curso3.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Curso Java");
        mentoria1.setDescricao("Mentoria do curso básico de Java");
        mentoria1.setData(LocalDate.now());





    }





}