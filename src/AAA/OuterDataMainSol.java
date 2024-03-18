package AAA;

import chapter07.Data;

public class OuterDataMainSol {
    public static void main(String[] args) {
        OuterData outerData = new OuterData();
        outerData.data = new Data();
        System.out.println("outerData.count: "+ outerData.count);
        System.out.println("outerData.data: "+ outerData.data); //null 값이 출력=> data변수는 아직 아무거도 참조하고 있지 않다.
        System.out.println("outerData.data.value: "+ outerData.data.value); //NULLPointExept
    }
}
