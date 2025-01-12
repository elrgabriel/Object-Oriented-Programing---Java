package Project_Book_Tracker;

public class Main {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Fernanda","feminino",27);
    Livro l1 = new Livro(p1,"Uma Volta ao Mundo","Julio Verne",356);
    l1.detalhes();
    l1.abrir();
    l1.detalhes();
    l1.folhear();
    l1.avancarPag();
    l1.avancarPag();
    l1.voltarPag();

    }
}