public class Kucing extends HewanPeliharaan{

    @Override
    public void Suara() {
        System.out.println("suara " + Nama + " adalah meow");
    }

    @Override
    public void Jenis() {
       System.out.println(Nama + " adalah kucing anggora");
    }

    public void Jenis(String Jenis) {
        System.out.println("jenis " + Nama + " adalah kucing " + Jenis);
    }

    public Kucing (String Nama, String Umur, String Warna, String JenisKelamin) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Warna = Warna;
        this.JenisKelamin = JenisKelamin;
    }

}
