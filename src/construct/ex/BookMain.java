package construct.ex;

public class BookMain {
    //기본 생성자 사용
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        //title 과 author 만을 매개변수로 받는 생성자
        Book book2 = new Book("Hello Java" , "Seo" );
        book2.displayInfo();

        //모든 필드를 매개변수로 받는 생성자
        Book book3 = new Book("JPA 프로그래밍 " , " KIM" , 50);
        book3.displayInfo();


    }

}
