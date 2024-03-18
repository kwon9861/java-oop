package chapter09;

public class InterfaceEx {
    // 상수
    public int MIN_PRICE = 0;
    public int MAX_PRICE = 100000;

    //추상
    public double meanPrice() {
        return 0;
    }

    public double totalPrice() {
        return 0;
    }

    // default
    double getSalePrice(double price){
        return price - (price * 0.05);
    }
    static void printPrice(double price){
        System.out.println(price);
    }
}
