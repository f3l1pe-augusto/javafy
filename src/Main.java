import br.com.fakecompany.javafy.models.Music;
import br.com.fakecompany.javafy.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music();

        System.out.println("\nMUSICS\n");
        music1.setTitle("The Way You Make Me Feel");
        music1.setSinger("Michael Jackson");
        music1.setDurationInSeconds(403);
        music1.setTotalPlays(458000000);
        music1.setLikes(2600000);

        music1.showAudio();

        Podcast podcast1 = new Podcast();

        System.out.println("\nPODCASTS\n");
        podcast1.setTitle("The Joe Rogan Experience");
        podcast1.setDurationInSeconds(7209);
        podcast1.setTotalPlays(3200000);
        podcast1.setLikes(606000);
        podcast1.setEpisodeNumber(1470);
        podcast1.setHost("Joe Rogan");
        podcast1.setGuest("Elon Musk");

        podcast1.showAudio();
    }
}
