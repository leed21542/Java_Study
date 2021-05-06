package hiding;

public class MyDate { //정보 은닉

    private int day;
    private int month;
    private int year;

    public void setDate(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void showDate(){
        System.out.println("오늘은 "+year+"년 "+month + "월 "+day+"일 입니다.");
    }
}
