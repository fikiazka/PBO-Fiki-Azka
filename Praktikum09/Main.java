package Praktikum09;

public class Main {
    public static void main(String[] args) {

        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.warna = "Silver";
        kulkas.harga = 3500000;
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.warna = "Hitam";
        tv.harga = 4500000;
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println("=== INFORMASI KULKAS ===");
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== INFORMASI TV ===");
        System.out.println(tv.getInfo());
    }
}

