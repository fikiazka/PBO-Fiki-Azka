package Praktikum04.Tugas;

public class Dokter {
    private String idDokter;
    private String nama;
    private String spesialisasi;

    public Dokter(String idDokter, String nama, String spesialisasi) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public String getDetailDokter() {
        return nama + " - " + spesialisasi + " (" + idDokter + ")";
    }
}
