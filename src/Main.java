import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Aprenda os fundamentos do Java.");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Framework");
        curso2.setDescricao("Desenvolva aplicações web com Spring.");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira em TI");
        mentoria1.setDescricao("Sessão de orientação com um especialista.");
        mentoria1.setData(LocalDate.now().plusDays(10));

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer DIO");
        bootcampJava.setDescricao("Formação completa para desenvolvedores Java.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(curso2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("--- Dev: " + devCamila.getNome() + " ---");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("XP Inicial: " + devCamila.calcularTotalXp());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos após progredir: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Total após progredir: " + devCamila.calcularTotalXp());

        System.out.println("\n------------------------------------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("--- Dev: " + devJoao.getNome() + " ---");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP Inicial: " + devJoao.calcularTotalXp());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos após progredir: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total após progredir: " + devJoao.calcularTotalXp());

        devJoao.progredir();
    }
}