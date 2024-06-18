package lista2.ex5;

public class TestarLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Vidas Secas", 176, "Editora Record", "Graciliano Ramos", "Masculino");
        System.out.printf("Informações do livro 1:\nTitulo: %s\nQuantidade de Paginas: %d\nEditora: %s\nAutor: %s\nGenero do Autor: %s", livro1.titulo, livro1.quantidadeDePaginas, livro1.editora, livro1.autor.nome, livro1.autor.genero);
        System.out.printf("\n\nInformações do livro 2:\nTitulo: %s\nQuantidade de Paginas: %d\nEditora: %s\nAutor: %s\nGenero do Autor: %s", livro2.titulo, livro2.quantidadeDePaginas, livro2.editora, livro2.autor.nome, livro2.autor.genero);
    }
}
