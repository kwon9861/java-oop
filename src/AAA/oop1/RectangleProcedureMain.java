package AAA.oop1;

public class RectangleProcedureMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 6;

        int area = getArea(width, height);
        System.out.println("가로가 "+width+"cm이고 높이가 "+height+"cm인 사각형의 넓이는: " + area+"cm2입니다.");

        int perimeter = getPerimeter(width, height);
        System.out.println("사각형의 길이는 :" + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }
    static int getArea(int width, int height){
        return width * height;
    }
    static int getPerimeter(int width, int height){
        return 2 * (width + height);
    }
    static boolean isSquare(int width, int heigth){
        return width == heigth;
    }
}