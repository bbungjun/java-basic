package static1;

public class Data3 {
    public String name;
    public static int count; //static 을 사용함으로써 공용으로 함께 사용하는 변수를 만듦

    public Data3(String name){
        this.name =name;
        count ++;
    }

}
