package Project_Book_Tracker;

import java.util.Random;

public class Livro implements Ipublicacao {
    private Pessoa leitor;
    private String titulo, autor;
    private int totPagina, pagAtual;
    private boolean aberto;

    //region Getter, Setter & Constructor
    public Livro(Pessoa leitor, String titulo, String autor, int totPagina) {
        setLeitor(leitor);
        setTitulo(titulo);
        setAutor(autor);
        setTotPagina(totPagina);
        setPagAtual(0);
        setAberto(false);
    }

    public Livro(Pessoa leitor, String titulo, String autor, int totPagina, int pagAtual, boolean aberto) {
        this.leitor = leitor;
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean abrto) {
        this.aberto = abrto;
    }
    //endregion

    public void detalhes() {
        System.out.println("\n####### " + getTitulo().toUpperCase() + " #######\n");
        System.out.println("Leitor: " + getLeitor().getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Páginas: " + getTotPagina());
        if (isAberto()) {
            System.out.println("O livro está aberto");
            System.out.println("Página atual: " + getPagAtual() + "\n");
        } else {
            System.out.println("O livro está fechado\n");
        }
    }

    @Override
    public void abrir() {
        if (!isAberto()) {
            setAberto(true);
            System.out.println("Abrindo livro...");
        } else {
            System.out.println("O livro já se encontra aberto");
        }
    }

    @Override
    public void folhear() {
    Random random = new Random();
        if (isAberto()) {
            setPagAtual(random.nextInt(1,getTotPagina()));
            System.out.println("Lendo página " + getPagAtual() + "...");
        }
    }

    @Override
    public void avancarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() + 1);
            System.out.println("Avancei para a página " + getPagAtual() + "...");

        }else {
            System.out.println("O livro está fechado...");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() - 1);
            System.out.println("Voltei para a página " + getPagAtual() + "...");
        }else {
            System.out.println("O livro está fechado...");
        }
    }
}
