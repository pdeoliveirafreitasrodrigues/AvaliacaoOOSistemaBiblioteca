package src.AvaliacaoOOSistemaBiblioteca.modelos;

import src.AvaliacaoOOSistemaBiblioteca.enumeradores.StatusLivro;

public class Livro {

    private int id;
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;
    private StatusLivro statusLivro;


    public Livro(){ };
    public Livro(int id, String nome, String autor, String editora, int qtdPaginas) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
        statusLivro = StatusLivro.DISPONIVEL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }
}
