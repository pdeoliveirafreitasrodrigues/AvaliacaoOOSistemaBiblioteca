package src.repositorios;

import src.AvaliacaoOOSistemaBiblioteca.controller.LivroController;
import src.AvaliacaoOOSistemaBiblioteca.interfaces.BibliotecaInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Biblioteca;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Livro;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepository implements BibliotecaInterface {

    private List<Biblioteca> bibliotecas;

    @Override
    public void adicionarLivroBiblioteca(int id, Livro livro) {

    }

    @Override
    public void excluirLivroBiblioteca() {

    }

    @Override
    public List<Livro> listarLivrosBiblioteca() {
        return null;
    }

    @Override
    public void salvar(Biblioteca entidade) {
        Biblioteca biblioteca = consultarPorId(entidade.getId());

        if(biblioteca == null) {
            bibliotecas.add(biblioteca);
        } else {
            biblioteca = entidade;
        }
    }

    @Override
    public void excluir(Biblioteca entidade) {

    }

    @Override
    public Biblioteca consultarPorId(int id) {
        Biblioteca bibliotecaBuscada = null;
        for (Biblioteca usuario : bibliotecas) {
            if (usuario.getId() == id)
                bibliotecaBuscada = usuario;
        }

        return bibliotecaBuscada;
    }
}
