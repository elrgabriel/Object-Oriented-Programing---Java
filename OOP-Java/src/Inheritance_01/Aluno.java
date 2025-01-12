package Inheritance_01;

public class Aluno extends Pessoa {
    private String curso;
    private boolean matr;

    //region Constructor matching super, Getters & Setters
    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public Aluno(String nome, String sexo, int idade, boolean matr, String curso) {
        super(nome, sexo, idade);
        this.setMatr(matr);
        this.setCurso(curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    //endregion

    public void cancelarMatr() {
        this.setMatr(false);
    }
}
