public interface iPrehravac {
     void prehraj(boolean hraj);
     default void prehraj(String nazevPisnicky) {
         System.out.println("Not available rn");
     }
}
