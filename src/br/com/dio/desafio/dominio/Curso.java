package br.com.dio.desafio.dominio;

public class Curso {
    protected String titulo;
    protected String descricao;
    protected int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
