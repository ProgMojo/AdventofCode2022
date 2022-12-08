public class Hund extends Vierbeiner{


    public Hund(String name, int alter, String art) {
        super(name, alter, art);
    }

   public static Hund Paul = new Hund("Paul", 20, "Chihuaha");
   public Hund Lukas = new Hund("Lukas", 21, "Weimaraner");
   public Hund Simeon = new Hund("Simeon",21, "Pudel");

    public static void bellen(){
        System.out.println("wuff wuff");
    }


}

