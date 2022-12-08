public class Hund extends Vierbeiner{


    public Hund(String name, int alter, String art) {
        super(name, alter, art);
    }

    Hund Trick = new Hund("Paul", 20, "Chihuaha");
    Hund Tick = new Hund("Lukas", 21, "Weimaraner");
    Hund Track = new Hund("Simeon",21, "Pudel");

    public static void bellen(){
        System.out.println("wuff wuff");
    }


}

