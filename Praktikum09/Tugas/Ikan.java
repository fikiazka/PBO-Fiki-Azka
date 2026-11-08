package Praktikum09.Tugas;

public class Ikan implements Perenang {
    public String nama;
    public String jenis;
    public double berat;
    public String habitat;

    public Ikan(String nama, String jenis, double berat, String habitat) {
        this.nama = nama;
        this.jenis = jenis;
        this.berat = berat;
        this.habitat = habitat;
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " sedang menyelam di dalam air.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang menggunakan siripnya.");
    }

    public void bertelur() {
        System.out.println(nama + " sedang berkembang biak dengan bertelur.");
    }

    public String getInfo() {
        return "Nama Ikan: " + nama +
               "\nJenis: " + jenis +
               "\nBerat: " + berat + " kg" +
               "\nHabitat: " + habitat;
    }
}
