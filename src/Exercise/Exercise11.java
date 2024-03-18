package Exercise;

import com.sun.nio.sctp.SctpStandardSocketOptions;

public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 24, 13, 3, 21};

        Math m = new Math();
        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
    }
}

class Math {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    int max(int[] arr) {
        for (int i:arr) {
//            System.out.println("배열의 "+(i+1)+"번째 원소를 입력하세요: "+arr[i]);
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    int min(int[] arr) {
        for (int i:arr) {
//            System.out.println("배열의 "+(i+1)+"번째 원소를 입력하세요: "+arr[i]);
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
