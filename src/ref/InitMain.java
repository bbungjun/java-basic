package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // value 1 은 INITDATA 에서 초기값이 지정이 되지 않았지만 자동으로 초기화 됨.
        System.out.println("value2 = " + data.value2);
    }
}
