public class Prisoner {
    private String name;
    private double height;
    private int sentence;

    public Prisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setSentence(int sentence){
        this.sentence = sentence;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }
}