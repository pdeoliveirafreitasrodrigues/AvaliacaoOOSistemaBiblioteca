package src.AvaliacaoOOSistemaBiblioteca.interfaces;

import src.AvaliacaoOOSistemaBiblioteca.modelos.Usuario;

import java.util.List;

public interface CrudInterface<T> {
    public void salvar(T entidade);
    public void excluir(T entidade);
    public T consultarPorId(int id);


}
