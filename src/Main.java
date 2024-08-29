

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descricao curso java");
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso python");
        curso2.setCargaHoraria(10);
        curso2.setDescricao("Descricao curso python");


    
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Angular");
        mentoria1.setDescricao("Descricao mentoria Angular");
        mentoria1.setData(LocalDate.now());
    
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria VueJs");
        mentoria2.setDescricao("Descricao mentoria VueJs");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.InscreverBootcamp(bootcamp);
        System.out.println("Dev: " + devArthur.getNome() + "/ Conteudos inscritos: " + devArthur.getConteudosInscritos());
        devArthur.progredir();
        System.out.println("Dev: " + devArthur.getNome() + "/ Conteudos concluidos: " + devArthur.getConteudosConcluidos());
        
        
        System.out.println("\n\n==========================\n\n");
        
        Dev devLucca = new Dev();
        devLucca.setNome("Lucca");
        devLucca.InscreverBootcamp(bootcamp);
        System.out.println("Dev: " + devLucca.getNome() + "/Conteudos inscritos: " + devLucca.getConteudosInscritos());
        devLucca.progredir();
        System.out.println("Dev: " + devLucca.getNome() + "/Conteudos inscritos: " + devLucca.getConteudosInscritos());
        System.out.println("Dev: " + devLucca.getNome() + "/ Conteudos concluidos: " + devLucca.getConteudosConcluidos());

    }


}
