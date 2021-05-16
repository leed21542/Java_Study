package Car;

public class calcTest {
    public static void main(String[] args) {
        completeCalc c1 = new completeCalc();
        calc c2 = new completeCalc();

        System.out.println(c1.add(10,11));
        c1.showInfo();
    }
}
