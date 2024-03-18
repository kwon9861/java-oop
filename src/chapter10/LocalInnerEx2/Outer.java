package chapter10.LocalInnerEx2;

public class Outer {
    interface InterfaceEx{
        void method();
    }
    InterfaceEx ie;

    public void setIe(InterfaceEx ie) {
        this.ie = ie;
    }
    void outerMethod(){
        ie.method();
    }
}
