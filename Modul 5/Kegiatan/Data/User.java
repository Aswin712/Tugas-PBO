package Data;

import Book.Book;
import Book.HistoryBook;
import Book.StoryBook;
import Book.TextBook;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private final ArrayList<Book> bookList;
    private final Scanner scanner;

    public User() {
        bookList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static Book[] books = {
            new HistoryBook("1031", "Regulus", "Ichika", 10),
            new StoryBook("1032", "Flos", "Minori", 11),
            new TextBook("1033", "Bug", "KairikiBear", 11)
    };

    public void displayBooks() {
        System.out.println("===== List of Books =====");
        System.out.printf("%-4s %-20s %-15s %-15s %s\n", "ID", "Judul", "Author", "Kategori", "Stock");
        for (Book book : books) {
            System.out.printf("%-4s %-20s %-15s %-15s %d\n", book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }

    public void addBook() {
        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline dari input sebelumnya

        // Membuat objek buku sesuai dengan input pengguna dan menambahkannya ke dalam ArrayList bookList
        Book newBook = new Book(bookId, title, author, stock);
        bookList.add(newBook);

        System.out.println("Book added successfully.");
    }

    public Book[] getBookList() {
        return bookList.toArray(new Book[0]);
    }
}
