package Aula1;

public class Funcionario {
    private int codMat;

    public Funcionario(int rg, int idade, int codMat){
        super(rg, idade);
        this.codMat = codMat;
    }

    public int getCodMat(){
        return codMat;
    }

    public void setIdade(int idade){
        if(idade > 10){
            super.idade = idade;
        } else{
            System.out.println(
                "O funcionario não pode ser menor de idade, o valor:" + idade + ""
            );
        }
    }
}
