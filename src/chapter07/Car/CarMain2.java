package chapter07.Car;

public class CarMain2 {
    public static void main(String[] args){
        Car[] cars = new Car[3];
        // Car 객체 생성
        Car tico = new Car();

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        for (int i = 0; i<cars.length; i++){
            cars[i] = tico;
        }
        System.out.println("2번 인덱스 color: " + cars[1].color);
        cars[1].color = "블랙";
        System.out.println("1번 인덱스 color: " + cars[1].color);
        cars[0].color = "빨강";
        System.out.println("0번 인덱스 color: " + cars[1].color);
    }
}
