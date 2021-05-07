package Cooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){ //승차
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"명 이고, 수익은 "+money+"입니다.");
    }
}
