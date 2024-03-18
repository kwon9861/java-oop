public class FinalEx {
    public static void main(String[] args){
        Final f = new Final();
        // f.number = 100; 은 안된다.
    }
}


class Final{
    final int number;
    Final(){
        number = 100;
    }
}