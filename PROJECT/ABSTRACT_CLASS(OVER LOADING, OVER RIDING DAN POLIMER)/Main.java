
public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Luna", "3", "coklat", "Betina");
        Kucing kucing2 = new Kucing("Lucy", "2", "putih", "Jantan");
        Burung burung = new Burung("Lily", "1", "kuning", "Jantan");
        
        System.out.println("hewan peliharaanku :");
        System.out.println("1");
        kucing1.displayInfo();
        kucing1.Jenis();
        kucing1.Suara();
        System.out.println("2");
        kucing2.displayInfo();
        kucing2.Jenis("British short hair");
        kucing2.Suara();
        System.out.println("3");
        burung.displayInfo();
        burung.Jenis();
        burung.Suara();
    }
}

