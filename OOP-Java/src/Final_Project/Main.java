package Final_Project;

/*
* Final project - Emulate a youtube page functionality, where a viewer with a login can watch, play, pause and like
* videos. Information from the video such as title, current viewer watching and rating are also implemented.
* */


public class Main {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 10 de PHP");
        v[2] = new Video("Aula 07 de JAVA");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu",19,'m',"jubicreisson22");
        g[1] = new Gafanhoto("Teresa",24,'f',"tetefuracao2000");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(87.8f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}