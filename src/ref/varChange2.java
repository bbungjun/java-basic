package ref;

public class varChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        Data dataB = dataA; // dataA가 가지고 있는 값을 복사해서 dataB 에 주는데 dataA 가 가지고 있는값이 주소값이야 따라서 dataB 도 dataA와 같은곳을 참조하게 되는구나



        System.out.println("dataA 참조값 = "  +dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);  //10
        System.out.println("dataV.value = " +  dataB.value); // 10

        dataA.value = 20 ;
        System.out.println(" dataA.value = " + dataA.value);  // 20
        System.out.println(" dataB.value = " + dataB.value);  //

        dataB.value = 30;
        System.out.println( dataA.value);//20
        System.out.println(dataB.value); // 30
    }
}
