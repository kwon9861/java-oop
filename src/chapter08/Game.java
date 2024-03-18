package chapter08;

public class Game {
    void display(GraphicCard gc){
        gc.process();
    }
    public static void main(String[] args){
        Game g = new Game();
        GraphicCard gc = new GraphicCard();
        g.display(gc);
        Amd a = new Amd();
        g.display(a);
        Nvidia n = new Nvidia();
        g.display(n);
    }
    void display(Amd gc){
        gc.process();
    }
    void display(Nvidia gc){
        gc.process();
    }
}
