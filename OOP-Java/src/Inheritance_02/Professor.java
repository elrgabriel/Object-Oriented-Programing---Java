package Inheritance_02;

public final class Professor extends Pessoa{

    protected String especialidade;
    protected float salario;


    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //region Getter & Setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    //endregion

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }
}
