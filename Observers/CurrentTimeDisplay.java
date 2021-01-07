import java.time.LocalTime;

public class CurrentTimeDisplay implements Observer, DisplayElement {
    private LocalTime time;
    private Subject timeData;

    public CurrentTimeDisplay(Subject timeData) {
        this.timeData = timeData;
        timeData.registerObserver(this);
    }

    public void update(LocalTime time) {
        this.time = time;
        display();
    }

    public void display() {
        System.out.println("Current time: " + time);
    }
}