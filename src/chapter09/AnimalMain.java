package chapter09;

public class AnimalMain {
    public static void main(String[] args) {
        Animal eagle = new Eagle();
        System.out.println(eagle);
        eagle.sleep();
        eagle.eat();

        Eagle eagleObj = (Eagle)eagle;
        eagleObj.eat();
        System.out.println(eagleObj);
    }
}
