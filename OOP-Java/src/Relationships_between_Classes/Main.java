package Relationships_between_Classes;
//Class07 - Relationships between classes
public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        Luta uec01 = new Luta();

        lutadores[0] = new Lutador("Pretty boy", "França", 31, 11, 3, 1, 1.75f, 68.9f);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.68f, 80.9f);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93f, 81.6f);
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 5,4,3,1.70f,119.3f);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);


        uec01.marcarLuta(lutadores[0],lutadores[1]);
        uec01.lutar();
        lutadores[0].status();
        lutadores[1].status();
    }
}