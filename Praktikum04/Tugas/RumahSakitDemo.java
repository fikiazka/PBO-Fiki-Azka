package Praktikum04.Tugas;

public class RumahSakitDemo {
    public static void main(String[] args) {

        Dokter dokter1 = new Dokter(
                "D001", "dr. Ani", "Penyakit Dalam");

        Dokter dokter2 = new Dokter(
                "D002", "dr. Bagus", "Anak");

        Pasien pasien1 = new Pasien(
                "P001", "Puspa Widya");

        Pasien pasien2 = new Pasien(
                "P002", "Yenny Anggraeni");

        RekamMedis rekam1 = new RekamMedis(
                "RM001",
                "19-09-2026",
                "Demam",
                dokter1);

        RekamMedis rekam2 = new RekamMedis(
                "RM002",
                "21-09-2026",
                "Batuk",
                dokter2);

        pasien1.tambahRekamMedis(rekam1);
        pasien1.tambahRekamMedis(rekam2);

        pasien1.tampilRiwayat();

        System.out.println();

        pasien2.tampilRiwayat();
    }
}