package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    protected String titulo;
    protected String descricao;
    protected LocalDate data;

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public String getTitulo() {
        return titulo;
    }


}
