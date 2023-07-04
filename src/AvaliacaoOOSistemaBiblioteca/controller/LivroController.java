package src.AvaliacaoOOSistemaBiblioteca.controller;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.CrudInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Livro;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;
import src.repositorios.LivroRepository;
import src.repositorios.UsuarioRepository;

import java.util.List;

public class LivroController implements CrudInterface<Livro> {

    private LivroRepository repository = new LivroRepository();

    @Override
    public void salvar(Livro entidade) {
        repository.salvar(entidade);
    }

    @Override
    public void excluir(Livro entidade) {
        Livro livroBuscado = repository.consultarPorId(entidade.getId());

        if (livroBuscado != null) {
            repository.excluir(livroBuscado);
        }
    }
    @Override
    public Livro consultarPorId(int id) {
        return repository.consultarPorId(id);
    }
}