package Praktikum07;

public class KeretaDemo {
    public static void main(String[] args) {
        KeretaBarang barang = new KeretaBarang(
            "Kereta Barang",
            101,
            80,
            50
        );

        KeretaPenumpang penumpang = new KeretaPenumpang(
            "Argo Wilis",
            202,
            120,
            400
        );

        System.out.println("=== INFORMASI KERETA BARANG ===");
        System.out.println(barang.cetakInfo());

        System.out.println("=== INFORMASI KERETA PENUMPANG ===");
        System.out.println(penumpang.cetakInfo());
    }
}