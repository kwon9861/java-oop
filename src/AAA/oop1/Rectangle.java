package AAA.oop1;

public class Rectangle {
        int width;
        int height;

        int getArea(){
            return width * height;
        }

        int getPerimeter(){
            return 2 * (width + height);
        }

        boolean isSquare(){
            return width == height;
    }
}
