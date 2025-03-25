public interface iPrehravac {
     void prehraj(boolean hraj);
     default void prehraj(String nazevPisnicky) {
         System.out.println("Nic neni ");
     }
     void prehrat();
     void zastavit();
     void pauza();

}
