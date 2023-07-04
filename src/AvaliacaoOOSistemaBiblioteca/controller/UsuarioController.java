package src.AvaliacaoOOSistemaBiblioteca.controller;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.CrudInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;
import src.repositorios.UsuarioRepository;

import java.util.List;

public class UsuarioController implements CrudInterface<Usuario> {

    private UsuarioRepository repository = new UsuarioRepository();

    @Override
    public void salvar(Usuario entidade) {
        repository.salvar(entidade);
    }

    @Override
    public void excluir(Usuario entidade) {
        Usuario usuarioBuscado = repository.consultarPorId(entidade.getId());

        if (usuarioBuscado != null) {
            repository.excluir(usuarioBuscado);
        }
    }

    @Override
    public Usuario consultarPorId(int id) {
        return repository.consultarPorId(id);
    }
}
