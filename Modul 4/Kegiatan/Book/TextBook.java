package Book;

public class TextBook extends Book {
    public TextBook(String id, String title, String author, int stock) {
        super(id, title, author, "Text", stock);
    }
}