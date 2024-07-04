public class Prisoner {
    public String name;
    public double height;
    public int sentence;


    public Prisoner(String name, double height, int sentence) {
        //exercise 3 part 1
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

}