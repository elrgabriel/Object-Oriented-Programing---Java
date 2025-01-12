package Final_Project;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    //region Getter & Setter
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    //endregion

    public void viuMaisUm(){    }


    @Override
    protected void ganharExp() {
        this.setExperiencia(getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
