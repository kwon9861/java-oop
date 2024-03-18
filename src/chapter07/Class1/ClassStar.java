package chapter07.Class1;

public class ClassStar {
    public static void main(String[] args) {
        //int형 배열 score를 10개 생성합니다.
        // int[] scores = new int[10];
        //학생 이름 배열 생성
        String[] studentName = {"kim", "lee", "park", "choi"}; // studentName.length = 3
        int[] scores = {100, 90, 80, 70};   // scores.lengthh = 3
        int[] ages={10, 20, 30, 40};    // ages.length = 3

        for(int i = 0; i < studentName.length; i++) {
            System.out.println("name: "+studentName[i]+"\tscore: "+ scores[i]+"\tage: "+ ages[i]);
        }
    }
}
