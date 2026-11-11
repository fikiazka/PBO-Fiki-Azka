package Praktikum10;

import java.util.ArrayList;

public class PegawaiDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M,Kom", "199402");
        Pegawai pegawai1 = dosen1;
        
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        Dosen newDosen = (Dosen) pegawai1;

        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");

        // TenagaKependidikan tenaga1 = new TenagaKependidikan("19750301", "Aida, A.Md", "Tenaga Administrasi");
        // TenagaKependidikan tenaga2 = new TenagaKependidikan("19650304", "Rika, S.T", "Tenaga Laboratorium");

        // ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        // daftarPegawai.add(dosen1);  
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tenaga1);
        // daftarPegawai.add(tenaga2);

        // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }
}
