package Construct;

public class MemberInitMain1 {
    public static void main(String [] args){
        MemberInit member1 = new MemberInit();
        member1.initMember("kim",10,100);

        MemberInit member2 = new MemberInit();
        member2.initMember("lee", 20, 90);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름: "+member.name+"나이: "+member.age+"점수: "+ member.grade);
        }
    }
}
