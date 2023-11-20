public class Burung extends HewanPeliharaan {
    public String Jk = "dua";

    @Override
    public void Suara() {
        System.out.println("suara " + Nama + " adalah CuitCuitciut");
    }

    @Override
    public void Jenis() {
        System.out.println(Nama + " adalah burung Kenari");

    }
    public void Jenis(String Jenis) {
        System.out.println("jenis " + Nama + " adalah burung " + Jenis);
    }
    
    public Burung (String Nama, String Umur, String Warna, String JenisKelamin) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Warna = Warna;
        this.JenisKelamin = JenisKelamin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(Nama + " adalah burung");
        System.out.println("kaki " + Nama + " ada " + Jk);
    }
}
