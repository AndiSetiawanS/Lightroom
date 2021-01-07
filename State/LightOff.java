public class LightOff implements State {
    Lightroom lightroom;

    public LightOff(Lightroom lightroom) {
        this.lightroom = lightroom;
    }

    public void onLamp() {
        System.out.println("Lampu Dinyalakan");
        lightroom.setState(lightroom.getLightOn());
    }

    public void offLamp() {
        System.out.println("Lampu Sedang Mati");
    }

    public void selectLamp() {
        System.out.println("\tPilih Lampu");
    }

    public String toString() {
        return "Lampu Mati";
    }
}
