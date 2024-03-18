package DDD;

public class ABMain {
    public static void main(String[] args) {
        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.method());

        System.out.println(b.FILE_NAME);
    }
}

interface A{
    final static String FILE_NAME = "FILE_NAME";
    String method();
}

class B implements A{
    String bField;

    public B(String bClass) {
    }

    public String method(){
        return "bClass";
    }
}
