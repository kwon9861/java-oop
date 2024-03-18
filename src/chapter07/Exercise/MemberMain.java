package chapter07.Exercise;

public class MemberMain {
    public static void main(String[] args){
        Member m = new Member();
        Member m2 = new Member();

        if (m==m2){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
        System.out.println("m = "+ m +"\n m2 = "+ m2);
    }
}
