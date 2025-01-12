package Inheritance_01;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    //region Constructor matching Super, Getters & Setters
    public Professor(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public Professor(String nome, String sexo, int idade, String especialidade, double salario) {
        super(nome, sexo, idade);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //endregion

    public void recebeAumento(double aumento){
        this.setSalario(getSalario() + aumento);
    }
}
