package classes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livros.contains(livro) && !livro.isEmprestado()) {
            livro.emprestar();
            usuario.emprestarLivro(livro);
            System.out.println("Livro emprestado com sucesso para " + usuario.getNome());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            livro.devolver();
            usuario.devolverLivro(livro);
            System.out.println("Livro devolvido com sucesso por " + usuario.getNome());
        } else {
            System.out.println("Este livro não está registrado como emprestado por este usuário.");
        }
    }
}
