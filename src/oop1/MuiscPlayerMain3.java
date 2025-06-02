package oop1;

public class MuiscPlayerMain3 {
    public static void main(String[] args) {
        MusciPlayerData data = new MusciPlayerData();
        //음악 플레이어 키기
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
        showStatus(data);



    }
    static void on(MusciPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 ON");
    }
    static void off(MusciPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어 OFF");
    }
    static void volumeUp(MusciPlayerData data){
        data.volume++;
        System.out.println(" 볼륨 증가 ");
    }
    static void volumeDown(MusciPlayerData data){
        data.volume --;
        System.out.println(" 볼륨 감소 ");
    }
    static void showStatus(MusciPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " +  data.volume);
        } else{
            System.out.println("음악 플레이어 OFF ");
        }

    }
}
