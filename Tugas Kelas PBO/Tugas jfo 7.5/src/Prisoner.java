public class Prisoner {
    public Cell cell;
    public String name;
    public double height;
    public int sentence;

    // exercise 2
    public Prisoner(){

    }
    public Prisoner(String name, double height, int sentence) {

        System.out.println("This is a constructor");

        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }



    //====================================== JFO_7.3 =======================================

    //exercise 2
    public void setField(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }


    //====================================== JFO_7.5 =======================================

    //exercise 1, part 1.
    public Prisoner(Cell cell){
        this.cell = cell;
    }
    public void display(){

        System.out.println("Nama sel: "+ cell.name);
    }

}