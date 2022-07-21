package src.modelo;

public class livro {
    private final String nomeLivro;
    private final String qtdLivro;

    public livro(String nomeLivro, String qtdLivro){
        this.nomeLivro = nomeLivro;
        this.qtdLivro = qtdLivro;

    }


    public String getnomeLivro(){
        return nomeLivro;
    }
    public String getQtdLivro() {return qtdLivro;}


}
