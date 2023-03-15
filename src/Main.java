import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java introdução");
        curso1.setDescricao("Aprendendo a programar com Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Entendendo POO");
        curso2.setDescricao("Aprendendo a programar com paradigma POO");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("java de forma simplificada");
        mentoria1.setDescricao("Você conseguirar entendelo mais  ");
        mentoria1.setData(LocalDate.now());

        /*      System.out.println(curso1);
                System.out.println(curso2);
                System.out.println(mentoria1);
                */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.setDataInicial(LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        System.out.println("Data Inicial: " + bootcamp.getDataInicial());
        System.out.println("---------");
        Dev dev = new Dev();
        dev.setNome("Raik");
        dev.inscreverBootcamp(bootcamp);
        dev.getConteudosConcluidos();
        System.out.println("Conteúdos Inscritos Raik: " + dev.getConteudosInscritos());

        dev.progredir();
        dev.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Raik: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Raik: " + dev.getConteudosConcluidos());

        System.out.println("Xp: " + dev.calcularTotalXp());


        System.out.println("-----------");
        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        dev2.getConteudosConcluidos();
        System.out.println("Conteúdos Inscritos Maria: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Maria: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos  Maria: " + dev2.getConteudosConcluidos());
        System.out.println("Xp: " + dev2.calcularTotalXp());

        System.out.println("---------");
        System.out.println("Data Final: " + bootcamp.getDataFinal());

    }
}