package br.com.dio.desafio.dominio;

import java.time.LocalDate;

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
    }


}
