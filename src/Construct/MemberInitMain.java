package Construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "kim";
        member1.age = 10;
        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        member2.name = "lee";
        member2.age = 20;
        member2.grade = 90;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name:"+member.name+" , age: "+member.age +" ,grade: "+member.grade);
        }
    }
}
