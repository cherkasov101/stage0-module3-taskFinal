package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public void revert(int number) {
        int x = (number % 10) * 10;
        x += (number / 10 % 10);
        x *= 10;
        x += (number / 100);

        System.out.println(x);
    }
}
