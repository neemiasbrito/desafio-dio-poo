import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java poo");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHorario(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHadassa = new Dev();
        devHadassa.setNome("Hadassa");
        devHadassa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Hadassa:" + devHadassa.getConteudosInscritos());
        devHadassa.progredir();
        devHadassa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Hadassa:" + devHadassa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Hadassa:" + devHadassa.getConteudosConcluidos());
        System.out.println("XP:" + devHadassa.calcularTotalXp());

        System.out.println("-------");

        Dev devNeemias = new Dev();
        devNeemias.setNome("Neemias");
        devNeemias.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neemias:" + devNeemias.getConteudosInscritos());
        devNeemias.progredir();
        devNeemias.progredir();
        devNeemias.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Neemias:" + devNeemias.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos Neemias:" + devNeemias.getConteudosConcluidos());
        System.out.println("XP:" + devNeemias.calcularTotalXp());

    }
}
