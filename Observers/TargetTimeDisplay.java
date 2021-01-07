import java.time.LocalTime;

public class TargetTimeDisplay implements Observer, DisplayElement {
    private LocalTime time;
    private Subject timeData;

    public TargetTimeDisplay(Subject timeData) {
        this.timeData = timeData;
        timeData.registerObserver(this);
    }

    public void update(LocalTime time) {
        this.time = time;
        display();
    }

    public void display() {
        if(time==LocalTime.of(06,00,00)) {
            System.out.println("Sudah pagi, waktunya matikan lampu\n");
        }
        else if (time==LocalTime.of(18,00,00)) {
            System.out.println("Sudah malam, waktunya hidupkan lampu\n");
        }
    }
}