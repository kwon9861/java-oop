package chapter07.Exercise;

public class Param1 {
    void add(int x, int y){
        int z = x + y;
        System.out.println(z);
    }

    void add(double x, double y){
        double z = x + y;
        System.out.println(z);
    }

    void add(int ... x){
        int sum = 0;
        for (int i=0; i<x.length; i++){
            sum += x[i];
        }
        System.out.println(sum);
    }
}
