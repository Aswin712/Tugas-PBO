public class PrisonerTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);

        System.out.println("Prisoner 1: " + bubba.getName() + ", Height: " + bubba.getHeight() + "m, Sentence: " + bubba.getSentence() + " years");
        System.out.println("Prisoner 2: " + twitch.getName() + ", Height: " + twitch.getHeight() + "m, Sentence: " + twitch.getSentence() + " years");


        twitch.setName(bubba.getName());
        twitch.setHeight(bubba.getHeight());
        twitch.setSentence(bubba.getSentence());

        System.out.println("\nPrisoner 2 (baru): " + twitch.getName() + ", Height: " + twitch.getHeight() + "m, Sentence: " + twitch.getSentence() + " years\n");


        System.out.println("apakaah buba dan twitch sama? " + (bubba == twitch));

        bubba = twitch;

        System.out.println("apakaah buba dan twitch sama? " + (bubba == twitch));

    }
}