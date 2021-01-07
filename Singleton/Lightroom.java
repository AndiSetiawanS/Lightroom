import java.util.Scanner;

public class Lightroom {
    private Scanner sc = new Scanner(System.in);
    private String Nama;
    private String Username;
    private String Email;
    private String Password;

    private static Lightroom uniqueInstance;

    private Lightroom() {}

    public static Lightroom getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Lightroom();
        }
        return uniqueInstance;
    }

    public void Display() {
        System.out.println("1. Hidupkan Lampu");
        System.out.println("2. Matikkan Lampu");
    }

    public void Daftar(){
        System.out.println("\tDAFTAR");
        System.out.print("Nama : ");
            Nama = sc.nextLine();
        System.out.print("Username : ");
            Username = sc.nextLine();
        System.out.print("Email : ");
            Email = sc.nextLine();
        System.out.print("Password : ");
            Password = sc.nextLine();
        System.out.print("\n");
    }

    public void Login(){
        System.out.println("\tLOGIN");
        System.out.print("Username : ");
            Username = sc.nextLine();
        System.out.print("Password : ");
            Password = sc.nextLine();
        System.out.print("\n");
    }

}