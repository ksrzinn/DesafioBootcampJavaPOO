package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    protected int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO + 30;
    }

    
    @Override
    public String toString() {
        return "Mentoria{Titulo: " + this.getTitulo() + ", Descricao: " + this.getDescricao() + ", CargaHoraria: " + this.getCargaHoraria() + "\n"; 
    }
}
