package Book;

public class HistoryBook extends Book {
    public HistoryBook(String id, String title, String author, int stock) {
        super(id, title, author, "History", stock);
    }
}