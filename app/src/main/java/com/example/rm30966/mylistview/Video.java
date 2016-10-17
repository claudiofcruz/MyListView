package com.example.rm30966.mylistview;

/**
 * Created by RM30966 on 17/10/2016.
 */
public class Video {
    private int codigo;
    private String titulo;
    private int duracao;

    public Video(int codigo, String titulo, int duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Video() {}

    @Override
    public String toString() {
        return codigo + "-" + titulo + ", " + duracao + " minutos.";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
