import java.util.Scanner;

public class MP3 implements iPrehravac {
private String znacka;

public MP3(String znacka) {
    this.znacka = znacka;
}
    @Override
    public void prehraj(boolean hraj) {
    if (true) {
       System.out.println("Přehravani MP3 znacky "+znacka+" spuštěna.");
    }
    else {
        System.out.println("Přehrávání MP3 značky "+znacka+" ukončena.");
    }
    }
public void pocet(int pocet) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < pocet; i++) {
        System.out.println("Number of MP3 is:  " + pocet + ".");

    }
}
    @Override
    public void prehraj(String nazevPisnicky) {
        System.out.println("Právě hraje písnička " + nazevPisnicky + ".");
    }

    @Override
    public void prehrat() {
        prehraj(true);
        System.out.println("Píseň s přehraje");
    }

    @Override
    public void zastavit() {
        prehraj(false);
        System.out.println("Píseň se zastavila");
    }

    @Override
    public void pauza() {
        prehraj(false);
        System.out.println("Píseň se zastavila");
    }

    @Override
    public String toString() {
        return "MP3{" +
                "znacka='" + znacka + '\'' +
                '}';
    }
}
