package Praktikum07;
public class Pegawai {
    public String nama;
    public String nip;
    public double gaji;

    // public Pegawai(){
    //     System.out.println("Ini constructor class pegawai");
    // }

    public Pegawai(String nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo(){
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";
        return info;
    }
}
