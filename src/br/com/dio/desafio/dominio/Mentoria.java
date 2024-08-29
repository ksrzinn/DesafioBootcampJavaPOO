package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    protected LocalDate data;

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{Titulo: " + this.getTitulo() + ", descricao: " + this.getDescricao() + ", data: " + this.getData() + "\n"; 
    }



}
