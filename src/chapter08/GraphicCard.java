package chapter08;

public class GraphicCard {
    int memory;

    public void process(){
        System.out.println("그래픽 처리");
    }
    public static void main(String[] args){
        GraphicCard gc = new GraphicCard();
        gc.process();

        gc = new Amd();
        gc.process();

        gc = new Nvidia();
        gc.process();
    }
}

class Amd extends GraphicCard{
    public void process(){
        System.out.println("AMD 그래픽처리");
    }
}

class Nvidia extends GraphicCard{
    public void process() {
        System.out.println("Nvidia 그래픽 처리");
    }
}