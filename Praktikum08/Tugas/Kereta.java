package Praktikum08.Tugas;

public abstract class Kereta {
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
    
    // Abstract method yang wajib di-override oleh subclass
    public abstract void jalan();
    public abstract void berhenti();

    public String cetakInfo() {
        String info = "";
        info += "Nama Kereta       : " + namaKereta + "\n";
        info += "Nomor Kereta      : " + nomorKereta + "\n";
        info += "Kecepatan Kereta  : " + kecepatanKereta + " km/jam\n";
        return info;
    }
}