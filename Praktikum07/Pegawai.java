package Praktikum07;
public class Pegawai {
    String nama;
    String nip;
    double gaji;

    public Pegawai(){
        System.out.println("Ini constructor class pegawai");
    }

    public String getInfo(){
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";
        return info;
    }
}
