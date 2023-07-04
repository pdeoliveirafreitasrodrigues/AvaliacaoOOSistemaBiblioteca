package src.AvaliacaoOOSistemaBiblioteca.interfaces;

import src.AvaliacaoOOSistemaBiblioteca.controller.LivroController;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Biblioteca;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Livro;

import java.util.List;

public interface BibliotecaInterface extends CrudInterface<Biblioteca>{

    public void adicionarLivroBiblioteca(int id, Livro livro);
    public void excluirLivroBiblioteca();
    public List<Livro> listarLivrosBiblioteca();

}
