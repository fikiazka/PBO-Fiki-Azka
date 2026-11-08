package Praktikum09.Tugas;

public class PerenangMain {
    public static void main(String[] args) {
        Ikan ikan = new Ikan("Nemo", "Ikan Badut", 0.5, "Laut");
        System.out.println("========== INFORMASI IKAN ==========");
        System.out.println(ikan.getInfo());
        System.out.println("\nAktivitas Ikan:");
        ikan.menyelam();
        ikan.berenang();
        ikan.bertelur();


        Manusia manusia = new Manusia("Andi", 20, "Laki-laki", "Gaya Bebas");
        System.out.println("\n========== INFORMASI MANUSIA ==========");
        System.out.println(manusia.getInfo());
        System.out.println("\nAktivitas Manusia:");
        manusia.menyelam();
        manusia.berenang();
        manusia.pakaikacamata();
    }
}
