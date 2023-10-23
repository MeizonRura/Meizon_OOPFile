import java.util.Scanner;

public class hitungNilai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama anda : ");
        String Nama = scanner.nextLine();
        System.out.print("masukkan NIM : ");
        int NIM = scanner.nextInt();
        System.out.print("Nilai Tubes: ");
        double nilaiTubes = scanner.nextDouble();
        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        double Totalnilai = (0.30*nilaiTubes)+(0.10*nilaiQuiz) + (0.10*nilaiTugas) + (0.25*nilaiUTS) +(0.25*nilaiUAS);

        System.out.println("nama : " + Nama +  "\nNIM  : " + NIM + "\nNilai  Matakuliah Pemograman Berorientasi Objek : " + Totalnilai);


    scanner.close();    
    }
}