public abstract class HewanPeliharaan {
    public String Nama;
    public String Umur;
    public String Warna;
    public String JenisKelamin;
    
    public void displayInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Umur + " tahun");
        System.out.println("Warna: " + Warna);
        System.out.println("Warna: " + JenisKelamin);
    }
    public abstract void Suara();
    public abstract void Jenis();



        
}