package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double f = temperatureCelsius * (double) 9 / (double) 5 + 32;
        System.out.println(f);
    }
}
