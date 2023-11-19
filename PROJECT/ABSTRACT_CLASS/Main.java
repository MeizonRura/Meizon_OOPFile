
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Luna", "3", "persia", "coklat", "Betina");
        Burung burung = new Burung("Lily", "1", "burung kenari", "kuning", "Jantan");
        
        System.out.println("hewan peliharaanku :");
        System.out.println("1");
        kucing.displayInfo();
        kucing.Suara();
        kucing.klasifikasi();
        System.out.println("2");
        burung.displayInfo();
        burung.Suara();
        burung.klasifikasi();
    }
}

