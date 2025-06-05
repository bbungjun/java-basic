package access.ex;

public class MaxCounter {

    private int count;
    private int max;


    public MaxCounter(int max){
        this.max = max ;
    }

    public void increment() {
        if (count < max) {
            count++;
        }else{
            System.out.println("최대값 초과");
        }
    }


    public int getCount(){

        return count;
    }

}
