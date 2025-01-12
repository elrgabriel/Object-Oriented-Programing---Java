package Project_Book_Tracker;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    //region Constructor, Getter and Setter
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //endregion

    public void fazerNiver(){
        System.out.println("Feliz aniversário " + getNome() + "!");
        setIdade(getIdade()+1);
    }
}
