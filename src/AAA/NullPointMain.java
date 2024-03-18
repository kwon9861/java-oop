package AAA;

import chapter07.Data;

public class NullPointMain {
    public static void main(String[] args) {
        Data data = null;
        data = new Data();
        System.out.println(data.value);
    }
}
