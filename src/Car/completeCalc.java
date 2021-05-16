package Car;

public class completeCalc extends calculator{
    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public void showInfo(){
        System.out.println("완료");
    }
}
