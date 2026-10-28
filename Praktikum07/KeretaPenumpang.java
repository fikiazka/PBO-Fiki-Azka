package Praktikum07;

public class KeretaPenumpang extends Kereta {
    public int jumlahPenumpang;

    public KeretaPenumpang(String namaKereta, int nomorKereta, int kecepatanKereta, int jumlahPenumpang) {
        super(namaKereta, nomorKereta, kecepatanKereta);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    @Override
    public String cetakInfo() {
        String info = super.cetakInfo();
        info += "Jumlah Penumpang  : " + jumlahPenumpang + " orang\n";
        return info;
    }
}