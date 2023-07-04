package src.repositorios;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.CrudInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository implements CrudInterface<Usuario> {

    private List<Usuario> usuarios;

    public UsuarioRepository(){
        usuarios = new ArrayList<Usuario>();
    }

    @Override
    public void salvar(Usuario entidade) {
        Usuario usuario = consultarPorId(entidade.getId());

        if(usuario == null) {
            usuarios.add(usuario);
        } else {
            usuario = entidade;
        }

    }

    public Usuario consultarPorId(int id) {
        Usuario usuarioBuscado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id)
                usuarioBuscado = usuario;
        }

        return usuarioBuscado;
    }

    @Override
    public void excluir(Usuario usuario) {
        usuarios.remove(usuario);
    }






}
