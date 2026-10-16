package Praktikum07;

public class Dosen extends Pegawai {
    String nidn;

    public Dosen(){
        System.out.println("Ini constructor class dosen");
    }

    public String getAllInfo(){
        String info = "";
        info += "NIP    : " + super.nip + "\n";
        info += "Nama   : " + super.nama + "\n";  
        info += "Gaji   : " + super.gaji + "\n";
        info += "NIDN   : " + this.nidn + "\n";

        return info;
    }
}
