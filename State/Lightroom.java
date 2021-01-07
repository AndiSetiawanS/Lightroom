public class Lightroom {

    State lightOn;
    State lightOff;

    State state;

    public Lightroom() {
        lightOn = new LightOn(this);
        lightOff = new LightOff(this);
        state = lightOff;
    }

    public void onLamp() {
        state.onLamp();
    }

    public void offLamp() {
        state.offLamp();
    }

    public void selectLamp() {
        state.selectLamp();
    }

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getLightOn() {
        return lightOn;
    }

    public State getLightOff() {
        return lightOff;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\tLIGHTROOM");
        result.append("\n");
        result.append(state + "\n");
        return result.toString();
    }
}
