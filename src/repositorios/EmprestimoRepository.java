
package src.repositorios;

        import src.AvaliacaoOOSistemaBiblioteca.interfaces.CrudInterface;
        import src.AvaliacaoOOSistemaBiblioteca.modelos.Emprestimo;

        import java.util.ArrayList;
        import java.util.List;

public class EmprestimoRepository implements CrudInterface<Emprestimo> {

    private List<Emprestimo> emprestimos;

    public EmprestimoRepository(){
        emprestimos = new ArrayList<Emprestimo>();
    }

    @Override
    public void salvar(Emprestimo entidade) {
        Emprestimo emprestimo = consultarPorId(entidade.getId());

        if(emprestimo == null) {
            emprestimos.add(emprestimo);
        } else {
            emprestimo = entidade;
        }

    }

    public Emprestimo consultarPorId(int id) {
        Emprestimo emprestimoBuscado = null;
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id)
                emprestimoBuscado = emprestimo;
        }

        return emprestimoBuscado;
    }

    @Override
    public void excluir(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }

}
