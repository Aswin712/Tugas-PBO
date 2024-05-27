package Data;

import Book.Book;
import util.iMenu;

import java.util.ArrayList;
import java.util.Scanner;



public class Student extends User implements iMenu {

    private long nim = 15;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();
    private static final int MAXIMUM_BORROW_DAYS = 14;
    private final Scanner scanner;

    public Student(Book[] books) {
        this.books = books;
        this.nim = nim;
        this.scanner = new Scanner(System.in);
    }

    public void choiceBook() {
        System.out.println("===== List of Books =====");
        System.out.printf("%-4s %-20s %-15s %-15s %s\n", "ID", "Judul", "Author", "Kategori", "Stock");
        for (Book book : books) {
            System.out.printf("%-4s %-20s %-15s %-15s %d\n", book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }

        System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk back)");
        System.out.print("Input: ");
        String bookId = scanner.nextLine();

        if (bookId.equals("99")) {
            return;
        }

        Book selectedBook = null;
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Buku dengan ID tersebut tidak ditemukan.");
            return;
        }

        int stock = selectedBook.getStock();
        if (stock == 0) {
            System.out.println("Stock buku kosong! Silahkan pilih yang lain.");
            return;
        }

        System.out.println("Berapa lama buku akan dipinjam? (maksimal 14 hari)");
        System.out.print("Input lama (hari): ");
        int borrowDays;
        try {
            borrowDays = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
            return;
        }

        if (borrowDays > MAXIMUM_BORROW_DAYS) {
            System.out.println("Maksimum peminjaman adalah 14 hari.");
            return;
        }

        stock--; // decrease the stock
        selectedBook.setStock(stock); // update the stock

        System.out.println("Anda telah berhasil meminjam buku dengan ID: " + selectedBook.getId());
        borrowedBooks.add(selectedBook);
    }

    public void returnBook() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Anda belum meminjam buku apapun.");
            return;
        }

        System.out.println("===== List of Borrowed Books =====");
        System.out.printf("%-4s %-20s %-15s %-15s %s\n", "ID", "Judul", "Author", "Kategori", "Stock");
        for (Book book : borrowedBooks) {
            System.out.printf("%-4s %-20s %-15s %-15s %d\n", book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }

        System.out.print("Masukkan ID buku yang ingin Anda kembalikan: ");
        String returnId = scanner.nextLine();

        Book bookToRemove = null;
        for (Book book : borrowedBooks) {
            if (book.getId().equals(returnId)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            borrowedBooks.remove(bookToRemove);
            int stock = bookToRemove.getStock();
            stock++;
            bookToRemove.setStock(stock);
            System.out.println("Buku dengan ID " + returnId + " telah berhasil dikembalikan.");
        } else {
            System.out.println("Buku dengan ID " + returnId + " tidak ditemukan dalam daftar buku yang Anda pinjam.");
        }
    }

    private void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Anda belum meminjam buku apapun.");
            return;
        }

        System.out.println("===== List of Borrowed Books =====");
        System.out.printf("%-4s %-20s %-15s %-15s %s\n", "ID", "Judul", "Author", "Kategori", "Stock");
        for (Book book : borrowedBooks) {
            System.out.printf("%-4s %-20s %-15s %-15s %d\n", book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }

    public long getNim() {
        return nim;
    }
    public void logout() {
        System.out.println("Keluar...");
    }
    @Override
    public void menu() {
        int choice;

        do {
            System.out.println("===== Menu Mahasiswa =====");
            System.out.println("1. Pilih Buku");
            System.out.println("2. Tampilkan Buku Yang Dipinjam");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    choiceBook();
                    break;
                case 2:
                    displayBorrowedBooks();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    logout();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan lagi.");
            }
        } while (choice != 4);
    }
}


