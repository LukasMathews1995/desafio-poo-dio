import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();
        curso.setTitulo("js");
        curso.setDescricao("js comeco");
        curso.setCargaHoraria(4);
        curso2.setTitulo("java");
        curso2.setDescricao("java comeco");
        curso2.setCargaHoraria(6);
        curso3.setTitulo("python");
        curso3.setDescricao("python comeco");
        curso3.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("java");
        mentoria.setDescricao("java comeco");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Lucas : " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Lucas : " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluido Lucas : " + devLucas.getConteudosConcluidos());
        System.out.println("XP : " + devLucas.calcularTotalXP());
        System.out.println("------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Joao : " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("_");
        System.out.println("Conteudos inscritos Joao : " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao : " + devJoao.getConteudosConcluidos());
        System.out.println("XP : " + devJoao.calcularTotalXP());

        }
    }
