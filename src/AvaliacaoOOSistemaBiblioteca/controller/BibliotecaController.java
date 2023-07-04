package src.AvaliacaoOOSistemaBiblioteca.controller;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.BibliotecaInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Biblioteca;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Livro;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;
import src.repositorios.BibliotecaRepository;

import java.util.List;

public class BibliotecaController implements BibliotecaInterface {

    private BibliotecaRepository repository = new BibliotecaRepository();
    private LivroController livro = new LivroController();

    @Override
    public void adicionarLivroBiblioteca(int id, Livro livro) {
        Biblioteca biblioteca = consultarPorId(id);
        LivroController livroController = new LivroController();

        Livro consultaLivro = livroController.consultarPorId(livro.getId());

        repository.adicionarLivroBiblioteca(biblioteca.getId(), consultaLivro);

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
        repository.salvar(entidade);
    }

    @Override
    public void excluir(Biblioteca entidade) {
        Biblioteca bibliotecaBuscada = repository.consultarPorId(entidade.getId());

        if (bibliotecaBuscada != null) {
            repository.excluir(bibliotecaBuscada);
        }
    }

    @Override
    public Biblioteca consultarPorId(int id) {
        return repository.consultarPorId(id);
    }
}
