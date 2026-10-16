package Praktikum07;

public class Dosen extends Pegawai {
    String nidn;

    public Dosen(){
        System.out.println("Ini constructor class dosen");
    }

    public String getInfo(){
        String info = super.getInfo();
        info += "NIDN   : " + nidn;

        return info;
    }

    public String getAllInfo(){ 
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }

    public Dosen (String nip, String nama, double gaji, String nidn){
        System.out.println("Ini constructor class dosen dengan parameter");
    }
}
