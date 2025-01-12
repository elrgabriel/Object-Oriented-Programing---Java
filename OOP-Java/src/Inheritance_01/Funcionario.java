package Inheritance_01;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //region Constructor matching super, Getters & Setters
    public Funcionario(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }public Funcionario(String nome, String sexo, int idade,String setor, boolean trabalhando) {
        super(nome, sexo, idade);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    //endregion

    public void mudarTrabalhando(boolean trabalhando) {
        this.setTrabalhando(trabalhando);
    }
}
