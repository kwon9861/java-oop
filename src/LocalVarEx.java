public class LocalVarEx {
    public static void main(String[] args) {
        Local local = new Local(); // 0x001
        System.out.println(local.name);

        local.process();
        System.out.println(local.name);

        local.printAge1();
        local.printAge2();

        int temp = 0;
        for (int i = 0; i < 10; i++) {

            temp += i; // temp = temp + i(0~9)
        }
        System.out.println(temp);
    }
}
