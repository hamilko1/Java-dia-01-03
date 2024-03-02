import java.util.ArrayList;

public class Pessoa {

    protected int rg = 0;

    protected int idade = 0;
    private ArrayList nomeFamiliares;

    public Pessoa(int rg, int idade){
        this.rg = rg;
        this.idade = idade;
        nomeFamiliares = new ArrayList<>();
    }

    public Pessoa(int rg){
        this.rg = rg;
        this.idade = 0;
        nomeFamiliares = new ArrayList<>();
    }

    public int getRg(){
        return rg;
    }

    public void setRG(int rg){
        this.rg = rg;
    }
}