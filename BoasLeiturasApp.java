import java.util.Scanner;

public class BoasLeiturasApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeLivros[] = new String[3];
        String nomeAutor[] = new String[3];
        int opcao;
        int numBusca;


        for (int i=0;i<nomeLivros.length;i++){
            System.out.println("Informe o nome do livro: ");
            nomeLivros[i] = input.nextLine();
        }

        for (int y=0;y<nomeAutor.length;y++){
            System.out.println("Informe o autor do livro: ");
            nomeAutor[y] = input.nextLine();
        }

        do {
            System.out.println("\n1 - Exibir livros informados"
                    + "\n2 - Exibir autores informados"
                    + "\n3 - Exibir livros e autores informados"
                    + "\n4 - Exibir livro de uma posição especifica"
                    + "\n5 - Exibir autor de uma posição especifica"
                    + "\n6 - Sair do menu"
                    + "\nEscolha uma opcao:");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("Livros informados:");
                    for (int a = 0; a < nomeLivros.length; a++) {
                        System.out.println(nomeLivros[a]);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Autores informados:");
                    for (int a = 0; a < nomeAutor.length; a++) {
                        System.out.println(nomeAutor[a]);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Livros e autores informados:");
                    for (int a = 0; a < nomeLivros.length; a++) {
                        System.out.println(nomeLivros[a]);
                    }
                    for (int a = 0; a < nomeAutor.length; a++) {
                        System.out.println(nomeAutor[a]);
                    }
                }
                case 4: {
                    System.out.print("Informe uma posição de 0 a 2: ");
                    numBusca = input.nextInt();
                    for (int i=0;i<nomeLivros.length;i++){
                        if (i == numBusca) {
                            System.out.println("\nO livro é: " + nomeLivros[i]);
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.print("Informe uma posição de 0 a 2: ");
                    numBusca = input.nextInt();
                    for (int y=0;y<nomeAutor.length;y++){
                        if (y == numBusca){
                            System.out.println("\nO autor é: " +nomeAutor[y]);

                        }
                    }
                    break;
                }

                case 6: {
                    System.out.println("Execução terminada");
                    break;
                }
                default: {
                    System.out.println("Opcao invalida, escolha outra");
                }
            }
        }while(opcao != 6);
    }
}



