import java.util.*;
import java.time.LocalTime;


public class TimeData implements Subject {
    private ArrayList<Observer> observers;
    private LocalTime time;

    public TimeData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(time);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(LocalTime time) {
        this.time = time;
        measurementsChanged();
    }

    public LocalTime getTime() {
        return time;
    }

}
