package chapter08;

import chapter08.Aclass;

public class BclassMain {
        public void methodB() {
            Aclass ac = new Aclass(); //사용불가
            ac.varA = "varA";         //사용불가
            ac.varA2 = "varA2";       //사용불가
            ac.methodA();             //사용불가
            ac.methodA2();            //사용불가
        }
    }
