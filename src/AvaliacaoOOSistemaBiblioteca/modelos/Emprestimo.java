package src.AvaliacaoOOSistemaBiblioteca.modelos;

import java.util.Date;

public class Emprestimo {


    private final int LIMITE_DIAS_EMPRESTIMO = 5;
    private Biblioteca biblioteca;
    private Livro livro;
    private Date dataEmprestimo;
    private int id;



    public int getLIMITE_DIAS_EMPRESTIMO() {
        return LIMITE_DIAS_EMPRESTIMO;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }

    public int setId() {
        return id;
    }

}
