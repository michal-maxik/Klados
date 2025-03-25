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
}
