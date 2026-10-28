package Praktikum07;

public class Kereta {
    public String namaKereta;
    public int nomorKereta;
    public int kecepatanKereta;

    public Kereta() {

    }

    public Kereta(String namaKereta, int nomorKereta, int kecepatanKereta) {
        this.namaKereta = namaKereta;
        this.nomorKereta = nomorKereta;
        this.kecepatanKereta = kecepatanKereta;
    }
    
    public String cetakInfo() {
        String info = "";
        info += "Nama Kereta       : " + namaKereta + "\n";
        info += "Nomor Kereta      : " + nomorKereta + "\n";
        info += "Kecepatan Kereta  : " + kecepatanKereta + " km/jam\n";
        return info;
    }
}