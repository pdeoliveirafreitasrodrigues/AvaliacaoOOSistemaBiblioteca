package src.AvaliacaoOOSistemaBiblioteca.interfaces;

import src.AvaliacaoOOSistemaBiblioteca.modelos.Emprestimo;

import java.util.Date;

public interface EmprestimoInterface extends CrudInterface<Emprestimo>{

    public Date calcularDataDevolucao(Date data, int limiteDias);
    public void emprestarLivro();
    public void devolverLivro();

}
