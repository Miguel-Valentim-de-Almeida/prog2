/*
Crie uma classe para representar um Livro. A classe deve ter informações sobre título,
quantidade de páginas, editora e Autor, sendo Autor uma classe com nome e gênero. A
classe Livro deve ter um construtor que não recebe e outro que recebe argumentos.
*/

package lista2.ex5;

public class Livro {
    String titulo;
    int quantidadeDePaginas;
    String editora;
    Autor autor;

    Livro () {
        titulo = "";
        quantidadeDePaginas = 0;
        editora = "";
        autor = new Autor("", "");
    }

    Livro (String titulo, int quantidadeDePaginas, String editora, String nome, String genero) {
        this.titulo = titulo;
        this.quantidadeDePaginas = quantidadeDePaginas;
        this.editora = editora;
        autor = new Autor(nome, genero);
    }
}
