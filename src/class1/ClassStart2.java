package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String [] students = {"학생" , "학생2"};
        int [] studentAges = {15,16};
        int [] studentGrade = {70 , 75 };

        for(int i=0; i < students.length; i ++){
            System.out.println("이름 = " +  students[i] + "나이 = " + studentGrade[i] +"성적 = " +  studentAges[i]);
        }
    }
}
