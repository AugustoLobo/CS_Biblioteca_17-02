package classes;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
        }
    }
}
