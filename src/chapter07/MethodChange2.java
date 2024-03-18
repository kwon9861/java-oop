package chapter07;

public class MethodChange2 {
    public static void main(String [] args){
        Data dataA = new Data(); // dataA는 참조값(주소, 0x001)
        dataA.value = 10; // 0x001.value = 10
        System.out.println("메소드 호출 전: dataA.value= "+dataA.value );
        changeRef(dataA);
        System.out.println("메소드 호출 후: dataA.value= "+dataA.value );
    }
    static void changeRef(Data dataX){
        System.out.println("dataX"+dataX);
        dataX.value = 20;
    }
}
