import java.util.Scanner;

public class Smartphone implements iPrehravac {
    public String model;


    public Smartphone(String model) {
        this.model = model;
    }
    @Override
    public void prehraj(boolean hraj) {
        if (true) {
            System.out.println("Přehravani Smartphone znacky "+model+" spuštěna.");
        }
        else {
            System.out.println("Přehrávání Smartphone značky "+model+" ukončena.");
        }
    }
    public void pocet(int pocet) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pocet; i++) {
            System.out.println("Number of Smartphones is:  " + pocet + ".");

        }
    }@Override
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
        return "Smartphone{" +
                "model='" + model + '\'' +
                '}';
    }
}
