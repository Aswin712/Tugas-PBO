package books;
public class TextBook extends Book{
    private String category;

    //2 nama method yg sama, bertujuan untuk menerapkan fungsi overloading. (Modul 3)
    public TextBook(){

    }
    public TextBook(String category){
        super(category);
        this.category = category;

    }

    //============================== SETTER =============================
    //setter yang override dari class Book.
    @Override
    public void setCategory(String category) {
        this.category = category;

    }

    //============================== GETTER =============================
    //Getter yang override dari class Book
    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public  String toString(){
        return category;
    }

}