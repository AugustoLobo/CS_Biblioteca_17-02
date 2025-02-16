package classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf) {
        super(nome, cpf);
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
