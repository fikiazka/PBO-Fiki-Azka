package Praktikum07;

public class KeretaBarang extends Kereta {
    public int kapasitasBarang;

    public KeretaBarang(String namaKereta, int nomorKereta, int kecepatanKereta, int kapasitasBarang) {
        super(namaKereta, nomorKereta, kecepatanKereta);
        this.kapasitasBarang = kapasitasBarang;
    }

    @Override
    public String cetakInfo() {
        String info = super.cetakInfo();
        info += "Kapasitas Barang  : " + kapasitasBarang + " ton\n";
        return info;
    }
}