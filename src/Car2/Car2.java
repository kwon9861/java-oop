package Car2;

public class Car2 {
    String color;
    String company;
    String type;

    Car2() {
        this("white", "기아", "경차");
    }
    Car2(String color, String company, String type){
        this.color = color;
        this.company = company;
        this.type = type;
    }

    Car2(String com, String t){
        this("white", com, t);
    }
    Car2(String t){
        this("white", "기아",t);
    }
    // Car2 클래스는 toString() 메소드를 오버라이딩하여 객체의 색상과 제조사와 유형
    public String toString() {
        return color + "-"+company +"-"+type;
    }
}
