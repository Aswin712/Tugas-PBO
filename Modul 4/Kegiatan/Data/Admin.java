package Data;

import Book.Book;
import util.iMenu;

import java.util.ArrayList;
import java.util.Scanner;
record Siswa(String nama, long nim, String fakultas, String jurusan) {}

public class Admin extends User implements iMenu {
    private static final ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public Admin(Book[] books) {
        User.books = books;
    }

    public boolean isAdmin() {
        return true;
    }

    public void addBook() {
        super.addBook();
    }

    public void displayBooks() {
        super.displayBooks();
    }


    public void addStudent() {
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        long nim;
        while (true) {
            try {
                System.out.print("NIM Mahasiswa (maksimal 15 angka): ");
                nim = Long.parseLong(scanner.nextLine());
                if (String.valueOf(nim).length() == 15 && nim > 0) {
                    break;
                } else {
                    System.out.println("NIM harus terdiri dari 15 angka.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
            }
        }

        System.out.print("Fakultas Mahasiswa: ");
        String fakultas = scanner.nextLine();

        System.out.print("Jurusan Mahasiswa: ");
        String jurusan = scanner.nextLine();

        Siswa siswa = new Siswa(nama, nim, fakultas, jurusan);
        daftarSiswa.add(siswa);

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    public void displayStudents() {
        System.out.println("===== List of Students =====");
        if (daftarSiswa.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            System.out.printf("%-20s %-15s %-20s %-20s\n", "Nama", "NIM", "Fakultas", "Jurusan");
            for (Siswa siswa : daftarSiswa) {
                System.out.printf("%-20s %-15s %-20s %-20s\n", siswa.nama(), siswa.nim(), siswa.fakultas(), siswa.jurusan());
            }
        }
    }

    @Override
    public void menu() {
        int choice;

        do {
            System.out.println("===== Admin Menu =====");
            System.out.println("1. Tambah Murid");
            System.out.println("2. Tampilkan Murid");
            System.out.println("3. Tambah Buku");
            System.out.println("4. Tampilkan Buku yang Tersedia");
            System.out.println("5. Keluar");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 5);
    }
}
