package Relationships_between_Classes;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //region Constructor, Getters, Setters
    public Lutador(String p_name, String p_nationaility, int p_age, int p_wins, int p_losses, int p_draws, float p_height, float p_weight) {
        this.nome = p_name;
        this.nacionalidade = p_nationaility;
        this.idade = p_age;
        this.vitorias = p_wins;
        this.derrotas = p_losses;
        this.empates = p_draws;
        this.altura = p_height;
        setPeso(p_weight);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (peso < 52.2f) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (peso <= 83.9f) {
            this.categoria = "Médio";
        } else if (peso <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    //endregion

    public void anunciarLutador() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println(getPeso() + " Kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getEmpates() + " empates");
        System.out.println(this.getDerrotas() + " derrotas");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}



