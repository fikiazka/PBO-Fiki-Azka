package Praktikum08.Tugas;

public class KeretaBarang extends Kereta {
    public int kapasitasBarang;

    public KeretaBarang(String namaKereta, int nomorKereta, int kecepatanKereta, int kapasitasBarang) {
        super(namaKereta, nomorKereta, kecepatanKereta);
        this.kapasitasBarang = kapasitasBarang;
    }

    @Override
    public void jalan() {
        System.out.println(namaKereta + " berjalan membawa muatan kargo/barang berat.");
    }

    @Override
    public void berhenti() {
        System.out.println(namaKereta + " mengerem perlahan karena beban berat yang diangkut.");
    }

    @Override
    public String cetakInfo() {
        String info = super.cetakInfo();
        info += "Kapasitas Barang  : " + kapasitasBarang + " ton\n";
        return info;
    }
}