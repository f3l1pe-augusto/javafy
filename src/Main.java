import br.com.fakecompany.javafy.models.AudioBook;
import br.com.fakecompany.javafy.models.Music;
import br.com.fakecompany.javafy.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music();

        System.out.println("\n****************** Welcome to JavaFy ******************");
        System.out.println("\nMUSICS");
        music1.setTitle("The Way You Make Me Feel");
        music1.setSinger("Michael Jackson");
        music1.setDurationInSeconds(403);
        music1.setTotalPlays(458000000);
        music1.setLikes(2600000);

        music1.showAudio();

        Music music2 = new Music();

        music2.setTitle("Sunflower");
        music2.setSinger("Swae Lee and Post Malone");
        music2.setDurationInSeconds(162);
        music2.setTotalPlays(220000000);
        music2.setLikes(15000000);

        music2.showAudio();

        Podcast podcast1 = new Podcast();

        System.out.println("\nPODCASTS");
        podcast1.setTitle("The Joe Rogan Experience");
        podcast1.setDurationInSeconds(7209);
        podcast1.setTotalPlays(3200000);
        podcast1.setLikes(606000);
        podcast1.setEpisodeNumber(1470);
        podcast1.setHost("Joe Rogan");
        podcast1.setGuest("Elon Musk");

        podcast1.showAudio();

        AudioBook audioBook1 = new AudioBook();

        System.out.println("\nAUDIOBOOKS");
        audioBook1.setTitle("Harry Potter and the Philosopher's Stone");
        audioBook1.setDurationInSeconds(30467);
        audioBook1.setTotalPlays(571000);
        audioBook1.setLikes(15000);
        audioBook1.setAuthor("J.K. Rowling");

        audioBook1.showAudio();
        System.out.println("\n*******************************************************");
    }
}
