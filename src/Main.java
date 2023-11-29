import br.com.fakecompany.javafy.calculus.RecomendationFilter;
import br.com.fakecompany.javafy.models.AudioBook;
import br.com.fakecompany.javafy.models.Music;
import br.com.fakecompany.javafy.models.Podcast;

public class Main {
    public static void main(String[] args) {
        RecomendationFilter recomendationFilter = new RecomendationFilter();

        Music music1 = new Music();

        System.out.println("\n****************** Welcome to JavaFy ******************");
        System.out.println("\nMUSICS");
        music1.setTitle("The Way You Make Me Feel");
        music1.setSinger("Michael Jackson");
        music1.setDurationInSeconds(403);
        music1.setTotalPlays(458000000);
        music1.setLikes(2600000);

        music1.showAudio();
        recomendationFilter.filter(music1);

        Music music2 = new Music();

        music2.setTitle("Sunflower");
        music2.setSinger("Swae Lee and Post Malone");
        music2.setDurationInSeconds(162);
        music2.setTotalPlays(220000000);
        music2.setLikes(15000000);

        music2.showAudio();
        recomendationFilter.filter(music2);

        Music music3 = new Music();

        music3.setTitle("Happier Than Ever");
        music3.setSinger("Billie Eilish");
        music3.setDurationInSeconds(315);
        music3.setTotalPlays(339000000);
        music3.setLikes(6200000);

        music3.showAudio();
        recomendationFilter.filter(music3);

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
        recomendationFilter.filter(podcast1);

        Podcast podcast2 = new Podcast();

        podcast2.setTitle("Podpah");
        podcast2.setDurationInSeconds(8720);
        podcast2.setTotalPlays(5400000);
        podcast2.setLikes(211000);
        podcast2.setEpisodeNumber(5);
        podcast2.setHost("Igão e Mítico");
        podcast2.setGuest("Lucas Inutilismo");

        podcast2.showAudio();
        recomendationFilter.filter(podcast2);

        AudioBook audioBook1 = new AudioBook();

        System.out.println("\nAUDIOBOOKS");
        audioBook1.setTitle("Harry Potter and the Philosopher's Stone");
        audioBook1.setDurationInSeconds(30467);
        audioBook1.setTotalPlays(571000);
        audioBook1.setLikes(15000);
        audioBook1.setAuthor("J.K. Rowling");

        audioBook1.showAudio();
        recomendationFilter.filter(audioBook1);

        AudioBook audiobook2 = new AudioBook();

        audiobook2.setTitle("Animal Farm");
        audiobook2.setDurationInSeconds(9341);
        audiobook2.setTotalPlays(1400000);
        audiobook2.setLikes(17000);
        audiobook2.setAuthor("George Orwell");

        audiobook2.showAudio();
        recomendationFilter.filter(audiobook2);

        AudioBook audiobook3 = new AudioBook();

        audiobook3.setTitle("The Subtle Art of Not Giving a F*ck");
        audiobook3.setDurationInSeconds(19382);
        audiobook3.setTotalPlays(32000);
        audiobook3.setLikes(884);
        audiobook3.setAuthor("Mark Manson");

        audiobook3.showAudio();
        recomendationFilter.filter(audiobook3);
        System.out.println("\n*******************************************************");
    }
}
