public class Burung extends HewanPeliharaan {

    @Override
    public void Suara() {
        System.out.println("suara " + Nama + " adalah CuitCuitciut");
    }

    @Override
    public void klasifikasi() {
        System.out.println(Nama + " adalah unggas");
    }
    
    public Burung (String Nama, String Umur, String Jenis, String Warna, String JenisKelamin) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Jenis = Jenis;
        this.Warna = Warna;
        this.JenisKelamin = JenisKelamin;
    }
}
