package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        data.defaultField  = 2 ;
        data.defaultMethod();

        //private 은 안됨

        data.innerAccess();

    }
}
