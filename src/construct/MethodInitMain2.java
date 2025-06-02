package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {

        MemberInit member1  = new MemberInit();
        initMember(member1, "이영준 " , 28 , 90);

        MemberInit member2 = new MemberInit();
        initMember(member2 , "카리나 " , 25 , 100);

        MemberInit [] members = {member1, member2};
        for(MemberInit s : members){
            System.out.println(s.age + s.name + s.grade);
        }
    }


    static void initMember(MemberInit member , String name , int age, int grade) {
        member.name = name ;
        member.age = age;
        member.grade = grade;


    }

}
