import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih jenis bangun ruang:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 :
                    Balok balok = new Balok("balok");
                    balok.inputNilai();
                    balok.luasPermukaan();
                    balok.volume();
                    break;

                case 2 :
                    Kubus kubus = new Kubus("kubus");
                    kubus.inputNilai();
                    kubus.luasPermukaan();
                    kubus.volume();
                    break;

                case 3 :
                    Tabung tabung = new Tabung("tabung");
                    tabung.inputNilai();
                    tabung.luasPermukaan();
                    tabung.volume();
                    break;

                default : System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
