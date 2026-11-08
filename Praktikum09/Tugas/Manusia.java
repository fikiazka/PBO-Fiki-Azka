package Praktikum09.Tugas;

public class Manusia implements Perenang {
    public String nama;
    public int umur;
    public String jenisKelamin;
    public String gayaRenang;

    public Manusia(String nama, int umur, String jenisKelamin, String gayaRenang) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.gayaRenang = gayaRenang;
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " sedang menyelam di dalam air.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang dengan gaya " + gayaRenang + ".");
    }

    public void pakaikacamata() {
        System.out.println(nama + " menggunakan kacamata renang.");
    }

    public String getInfo() {
        return "Nama: " + nama +
               "\nUmur: " + umur + " tahun" +
               "\nJenis Kelamin: " + jenisKelamin +
               "\nGaya Renang: " + gayaRenang;
    }
}
