package AAA.oop1;

public class MusicPlayerProcedure {
    public static void main(String[] args) {
        int volumn = 0;
        boolean isOn = false;
        // mp 켜기 > 볼륨 증가 > 볼륨 감소 > mp 현상태 출력
        isOn = true;
        System.out.println("mp 시작합니다.");

        volumn++;
        System.out.println("volumn ++: " + volumn);

        volumn++;
        System.out.println("volumn ++: " + volumn);

        volumn--;
        System.out.println("volumn --: " + volumn);

        volumn++;
        System.out.println("volumn ++: " + volumn);

        System.out.print("mp의 현재상태 확인");
        if (isOn){
            System.out.println(" mp는 ON 상태이고 , 볼륨: "+ volumn);
        }else {
            System.out.println(" mp상태는 OFF!!!");
        }
    }
}
