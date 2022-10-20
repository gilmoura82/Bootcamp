import Dominio.*;

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

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp1);
        devMarcos.progresso();
        System.out.println("---");

        System.out.println("Conteúdos Inscritos Marcos " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Marcos " + devMarcos.getConteudosConcluidos());
        System.out.println("XP " + devMarcos.calcularTotalXp());

        System.out.println("----------");

        Dev devMaria = new Dev();
        devMarcos.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp1);
        devMarcos.progresso();
        System.out.println("---");


        System.out.println("Conteúdos Inscritos Maria " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Marcos " + devMarcos.getConteudosConcluidos());
        System.out.println("XP " + devMaria.calcularTotalXp());

        System.out.println("----------");




    }





}