package src.visao;

import src.modelo.livro;
import src.modelo.autor;


public class app {
        public static void main(String[] args){
            livro l1 = new livro("O nome do vento", "1");
            autor a1 = new autor("Patrick Rothfuss", "1");

            System.out.println("Nome do livro: " + l1.getnomeLivro());
            System.out.println("Nome do autor: " + a1.getNomeAutor());
            System.out.println("Quantidade de livros: "+ l1.getQtdLivro());
            System.out.println("Quantidade de autores: "+ a1.getQtdAutor());


    }
}
