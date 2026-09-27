package Praktikum04.Tugas;
import java.util.ArrayList;

public class Pasien {
    private String idPasien;
    private String nama;
    private ArrayList<RekamMedis> daftarRekamMedis;

    public Pasien(String idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.daftarRekamMedis = new ArrayList<>();
    }

    public void tambahRekamMedis(RekamMedis rekamMedis) {
        daftarRekamMedis.add(rekamMedis);
    }

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<RekamMedis> getDaftarRekamMedis() {
        return daftarRekamMedis;
    }

    public void setDaftarRekamMedis(ArrayList<RekamMedis> daftarRekamMedis) {
        this.daftarRekamMedis = daftarRekamMedis;
    }

    public void tampilRiwayat() {
        System.out.println("ID Pasien : " + idPasien);
        System.out.println("Nama      : " + nama);

        if (daftarRekamMedis.isEmpty()) {
            System.out.println("Belum ada rekam medis.");
        } else {
            System.out.println("Riwayat Rekam Medis:");

            for (RekamMedis rm : daftarRekamMedis) {
                rm.getDetailPemeriksaan();
            }
        }
    }
}