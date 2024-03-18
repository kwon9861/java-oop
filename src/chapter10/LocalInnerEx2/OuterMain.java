package chapter10.LocalInnerEx2;

    public class OuterMain{
        public static void main(String[] args) {
            Outer out = new Outer();

            out.setIe(new InterfaceExImple());
            out.outerMethod();
            out.setIe(new InterfaceExImple2());
            out.outerMethod();
        }
    }