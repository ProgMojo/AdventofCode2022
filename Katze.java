public class Katze extends Vierbeiner {


    public Katze(String name, int alter, String art) {
        super(name, alter, art);
    }

    public static Katze Mario = new Katze("Mario", 16, "Main-Coon Katze");

    public static void Schnurr(){
        System.out.println("Schnurr Schnurr");

    }
}
