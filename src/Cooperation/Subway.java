package Cooperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber+"번 버스의 승객은 "+passengerCount+"명 이고, 수익은 "+money+"입니다.");
    }
}
