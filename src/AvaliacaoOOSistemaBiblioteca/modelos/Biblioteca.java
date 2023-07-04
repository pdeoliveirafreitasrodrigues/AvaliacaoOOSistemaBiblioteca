package src.AvaliacaoOOSistemaBiblioteca.modelos;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.BibliotecaInterface;

import java.util.List;

public class Biblioteca {

    private int id;
    private String nome;
    private List<Livro> livros;

    public Biblioteca(int id, String nome, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.livros = livros;
    }

    public Biblioteca() { }

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

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
