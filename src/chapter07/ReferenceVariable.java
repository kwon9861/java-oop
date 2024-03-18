package chapter07;

public class ReferenceVariable {
    public static void main(String[] args) {
        int[] n = new int[]{0, 1, 2, 3, 4};
        System.out.println("n of address = " + n);

        int[] refN = n; // n참조변수에 있는 주소를 읽어 주소값을 refN에 복사합니다.
        System.out.println("refN of address =" + refN);
        for (int i = 0; i < refN.length; i++) {
            System.out.println(refN[i]);
        }
    }
}
