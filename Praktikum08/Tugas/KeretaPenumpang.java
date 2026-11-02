package Praktikum08.Tugas;

public class KeretaPenumpang extends Kereta {
    public int jumlahPenumpang;

    public KeretaPenumpang(String namaKereta, int nomorKereta, int kecepatanKereta, int jumlahPenumpang) {
        super(namaKereta, nomorKereta, kecepatanKereta);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    @Override
    public void jalan() {
        System.out.println(namaKereta + " melaju cepat membawa penumpang dengan nyaman.");
    }

    @Override
    public void berhenti() {
        System.out.println(namaKereta + " berhenti di stasiun untuk menurunkan penumpang.");
    }

    @Override
    public String cetakInfo() {
        String info = super.cetakInfo();
        info += "Jumlah Penumpang  : " + jumlahPenumpang + " orang\n";
        return info;
    }
}