package defendencyoff;

public class ABMain {
    public static void main(String[] args) {
        A a = new A("Aclass");
        System.out.println(a.aField);
        System.out.println(a.aMethod());

        B b = new B("Bclass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());
    }
}

class A{
    String aField;
    public A(String aFeield){
        this.aField = aFeield;
    }

    public String aMethod() {
        return "A.aMethod";
    }
}
class B{
    String bField;
    public B(String bField){
        this.bField = bField;
    }

    public String bMethod() {
        return "B.bMethod";
    }
}