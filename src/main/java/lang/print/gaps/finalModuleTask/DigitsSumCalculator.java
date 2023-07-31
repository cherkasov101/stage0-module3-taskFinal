package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count += number % 10;
            number /= 10;
        }
        System.out.println(count + number);
    }
}
