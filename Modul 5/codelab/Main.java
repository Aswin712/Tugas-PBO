import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i =1;
        while (true) {
            System.out.print("Masukkan Nama ke-" + i + ": ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            } else if (nama.trim().isEmpty()) {
                System.out.println("Nama Tidak Boleh Kosomg!");
                continue;
            }

            daftarMahasiswa.add(nama);
            i++; 
        }

        System.out.println("\nDaftar Mahasiswa Yang Diinputkan:");
        for (String namaMahasiswa : daftarMahasiswa) {
            System.out.println(namaMahasiswa);
        }

        scanner.close();
    }
}