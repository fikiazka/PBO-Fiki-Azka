package Praktikum04.Tugas;

public class RekamMedis {
    private String idRekamMedis;
    private String tanggal;
    private String diagnosa;
    private Dokter dokterPenanggungJawab;

    public RekamMedis(String idRekamMedis, String tanggal,
                      String diagnosa, Dokter dokterPenanggungJawab) {
        this.idRekamMedis = idRekamMedis;
        this.tanggal = tanggal;
        this.diagnosa = diagnosa;
        this.dokterPenanggungJawab = dokterPenanggungJawab;
    }

    public String getIdRekamMedis() {
        return idRekamMedis;
    }

    public void setIdRekamMedis(String idRekamMedis) {
        this.idRekamMedis = idRekamMedis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public Dokter getDokterPenanggungJawab() {
        return dokterPenanggungJawab;
    }

    public void setDokterPenanggungJawab(Dokter dokterPenanggungJawab) {
        this.dokterPenanggungJawab = dokterPenanggungJawab;
    }

    public void getDetailPemeriksaan() {
        System.out.println("ID Rekam Medis : " + idRekamMedis);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("Diagnosa       : " + diagnosa);
        System.out.println("Dokter         : "
                + dokterPenanggungJawab.getNama());
        System.out.println();
    }
}
