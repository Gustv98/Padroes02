package src.modelo;

public class autor {
    private final String nomeAutor;
    private final String qtdAutor;

    public autor(String nomeAutor, String qtdAutor){
        this.nomeAutor = nomeAutor;
        this.qtdAutor = qtdAutor;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }
    public String getQtdAutor() {return qtdAutor;}

}
