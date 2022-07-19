import java.util.Scanner;


public class CadastraLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

            System.out.println("Digite o nome do livro");
            livro.setNome(scanner.nextLine());

            System.out.println("Digite o nome do autor");
            livro.setNomeAutor(scanner.nextLine());
        }
    }




