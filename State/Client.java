public class Client {
    public static void main(String[] args) {

        Lightroom lightroom = new Lightroom();

        System.out.println(lightroom);

        lightroom.selectLamp();
        lightroom.onLamp();
        lightroom.selectLamp();
        lightroom.offLamp();
        
    }
}