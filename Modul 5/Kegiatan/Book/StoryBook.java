package Book;

public class StoryBook extends Book.Book {
    public StoryBook(String id, String title, String author, int stock) {
        super(id, title, author, "Story", stock);
    }
}