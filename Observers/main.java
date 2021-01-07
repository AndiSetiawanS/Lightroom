import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        TimeData timeData = new TimeData();
        CurrentTimeDisplay currentDisplay = new CurrentTimeDisplay(timeData);
        TargetTimeDisplay targetDisplay = new TargetTimeDisplay(timeData);

        timeData.setMeasurements(LocalTime.of(06,00,00));
        timeData.setMeasurements(LocalTime.of(18,00,00));
    }
}