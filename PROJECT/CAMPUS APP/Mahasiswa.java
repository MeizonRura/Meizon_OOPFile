public class Mahasiswa {
    private String nim;
    private String nama;
    private String JenisKelamin;
    private String NoHP;

    public Mahasiswa(String nim, String nama, String JenisKelamin, String NoHP) {
        this.nama = nama;
        this.nim = nim;
        this.JenisKelamin = JenisKelamin;
        this.NoHP = NoHP ;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public String getNoHP() {
        return NoHP;
    }
}
