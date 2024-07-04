public class PrisonTest {

    //================================== MAIN METHOD ========================================
    public static void main(String[] args) {
        jfo_7_5();


    }

    //================================== OTHER METHOD =======================================

    //==================================== JFO 7.2 ==========================================
    public static void jfo_7_2(){
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);

        System.out.println("Prisoner 1: " + bubba.name + ", Height: " + bubba.height + "m, Sentence: " + bubba.sentence + " years");
        System.out.println("Prisoner 2: " + twitch.name + ", Height: " + twitch.height + "m, Sentence: " + twitch.sentence + " years");


        twitch.name = bubba.name;
        twitch.height = bubba.height;
        twitch.sentence = bubba.sentence;

        System.out.println("\nPrisoner 2 (baru): " + twitch.name + ", Height: " + twitch.height + "m, Sentence: " + twitch.sentence + " years\n");


        System.out.println("apakaah buba dan twitch sama? " + (bubba == twitch));

        //bubba = twitch;

        System.out.println("apakaah buba dan twitch sama? " + (bubba == twitch));
    }

    //====================================== JFO 7.3 =========================================
    public static void jfo_7_3(){
        Prisoner p01 = new Prisoner(null, 0.0 , 0);
        Prisoner p02 = new Prisoner(null, 0.0 , 0);

        System.out.println(p01);
        System.out.println(p02);

        //exercise 2
        p01.setField("Bubba", 2.08, 4);
        p02.setField("Twitch", 1.73, 3);

        System.out.println(p01.name);

        // exercise 3 part 2
        p01.name = "Bubba";
        p01.height = 2.08;
        p01.sentence = 4;

        p02.name = "Twitch";
        p02.height = 1.73;
        p02.sentence = 3;

    }


    //=================================== JFO 7.4 ========================================

    public static void jfo_7_4(){
        PrisonTest objPrisonTest = new PrisonTest();

        objPrisonTest.infoprisoner();
        objPrisonTest.infoprisoner(true);

    }

    public void infoprisoner() {
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);

        System.out.println("Name:" + bubba.name + "\nHeight: " + bubba.height + "\nSentence: " + bubba.sentence + "\n");
        System.out.println("Name:" + twitch.name + "\nHeight: " + twitch.height + "\nSentence: " + twitch.sentence + "\n");
    }

    public void infoprisoner(boolean think){
        if(think){
            think();
        }
    }

    public void think(){
        System.out.println("=== Memanggil method think ====");
        infoprisoner();
    }

    //=================================== JFO 7.5 ========================================
    public static void jfo_7_5(){


    }


}