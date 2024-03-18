package Construct;

public class MemberConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("kim", 10, 100);
        MemberConstruct member2 = new MemberConstruct("kim", 10, 100);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct m : members) {
            System.out.println("name: " + m.name + ", grade: " + m.grade);
        }
    }
}