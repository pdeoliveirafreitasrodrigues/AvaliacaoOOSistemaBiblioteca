package src.AvaliacaoOOSistemaBiblioteca.controller;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.EmprestimoInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Emprestimo;
import src.repositorios.EmprestimoRepository;
import src.repositorios.LivroRepository;

import java.util.Date;
import java.util.List;

public class EmprestimoController implements EmprestimoInterface {
    private EmprestimoRepository repository;

    @Override
    public void salvar(Emprestimo entidade) {
        Emprestimo emprestimoBuscado = repository.consultarPorId(entidade.getId());

        if (emprestimoBuscado != null) {
            repository.salvar(emprestimoBuscado);
        }
    }

    @Override
    public void excluir(Emprestimo entidade) {
        Emprestimo emprestimoBuscado = repository.consultarPorId(entidade.getId());

        if (emprestimoBuscado != null) {
            repository.excluir(emprestimoBuscado);
        }
    }

    @Override
    public Emprestimo consultarPorId(int id) {
        return null;
    }

    @Override
    public Date calcularDataDevolucao(Date data, int limiteDias) {


        return null;
    }

    @Override
    public void emprestarLivro() {

    }

    @Override
    public void devolverLivro() {

    }
}
