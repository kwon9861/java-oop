package chapter08;

import chapter08.Aclass;
public class CClassMain extends Aclass {
        CClassMain() {
            // Aclass ac = new Aclass(); //사용불가
            this.varA = "varA";         //사용불가
            this.varA2 = "varA2";       //사용불가
            this.methodA();             //사용불가
            this.methodA2();            //사용불가
        }
    }
