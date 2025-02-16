import classes.Biblioteca;
import classes.Livro;
import classes.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario1 = new Usuario("Carlos Silva", "123456789");
        biblioteca.cadastrarUsuario(usuario1);

        biblioteca.emprestarLivro(usuario1, livro1);
        biblioteca.devolverLivro(usuario1, livro1);
    }
}