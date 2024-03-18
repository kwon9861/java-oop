package AAA.oop1;

public class MusicPlayerMain {
    public static void main(String [] args){
        MusicPlayer mp = new MusicPlayer();
        // mp
        mp.isOn = true;
        System.out.println("mp 시작합니다.");
        mp.volumn++;
        System.out.println("volumn ++" + mp.volumn);
        mp.volumn++;
        System.out.println("volumn ++" + mp.volumn);
        mp.volumn--;
        System.out.println("volumn --" + mp.volumn);

        System.out.println("mp의 현재상태 확인");
        if (mp.isOn){
            System.out.println("mp는 ON 상택이고, 불륨: "+ mp.volumn);
        }else{
            System.out.println("mp 상태는 OFF!!");
        }
    }
}
