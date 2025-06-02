package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1" , 20 , 60);
        MemberConstruct member2 = new MemberConstruct("member2", 25 , 90 );

        MemberConstruct [] members = {member1, member2};

        for (MemberConstruct s : members){
            System.out.println("이름 = " + s.name + " 나이 = " + s.age + " 성적 = " + s.grade);
        }




    }
}
