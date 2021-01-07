public class LightOn implements State {
    Lightroom lightroom;

    public LightOn(Lightroom lightroom) {
        this.lightroom = lightroom;
    }

    public void onLamp() {
        System.out.println("Lampu Sudah Menyala");
    }

    public void offLamp() {
        System.out.println("Lampu Dimatikan");
    }

    public void selectLamp() {
        System.out.println("\tPilih Lampu");
    }

    public String toString() {
        return "Lampu Menyala";
    }
}
