package oop;

public class MusicPlayer {

    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이러르 종료합니다.");
    }
    void volumeUp(){
        volume++;
        System.out.println(" 볼륨 증가 =  " + volume);
    }
    void volumeDown(){
        volume --;
        System.out.println("볼륨 감소 = " + volume);
    }
    void showStatus(){
        System.out.println("음악플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 실행중" + volume);
        }else{
            System.out.println("음악 플레이어 종료");
        }
    }


}
