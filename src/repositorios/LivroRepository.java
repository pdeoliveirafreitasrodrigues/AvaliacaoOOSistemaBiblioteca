package src.repositorios;

import src.AvaliacaoOOSistemaBiblioteca.interfaces.CrudInterface;
import src.AvaliacaoOOSistemaBiblioteca.modelos.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository implements CrudInterface<Livro> {

    private List<Livro> livros;

    public LivroRepository(){
        livros = new ArrayList<Livro>();
    }

    @Override
    public void salvar(Livro entidade) {
        Livro livro = consultarPorId(entidade.getId());

        if(livro == null) {
            livros.add(livro);
        } else {
            livro = entidade;
        }

    }

    public Livro consultarPorId(int id) {
        Livro livroBuscado = null;
        for (Livro livro : livros) {
            if (livro.getId() == id)
                livroBuscado = livro;
        }

        return livroBuscado;
    }

    @Override
    public void excluir(Livro livro) {
        livros.remove(livro);
    }
}
