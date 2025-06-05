package pack;

import pack.a.User;


public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User UserB = new pack.b.User();
    }
}


//import 는 하나만 사용 할 수 있다. 이때는 자주 사용하는 패키지를 import 하도록 하고
//다른 패키지는 전체 경로를 적어주자 .