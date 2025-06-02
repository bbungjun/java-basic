package class1;

public class ClassStrat5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 100;

        Student[] students = new Student[]{student1, student2};

        for(int i = 0 ; i< students.length; i++ ){
            System.out.println("이름 : " + students[i].name + " 나이 = " + students[i].age + "성적 = " + students[i].grade);
        }
        //for 문 최적화

        for (int i =0; i < students.length; i ++){
            Student s = students[i];
            System.out.println(s.name + s.age + s.grade);
        }

        //향상된 for 문
        for (Student s : students ){
            System.out.println("이름 :" + s.name + s.age + s.grade);
        }

    }
}
