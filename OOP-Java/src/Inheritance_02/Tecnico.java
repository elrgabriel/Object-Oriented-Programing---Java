package Inheritance_02;

public final class Tecnico extends Aluno{
    private int registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    //region Getter & Setter
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    //endregion

    public void praticar(){
        System.out.println("Aluno técnitco praticando...");
    }
}
