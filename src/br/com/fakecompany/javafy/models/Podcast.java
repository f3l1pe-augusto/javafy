package br.com.fakecompany.javafy.models;

public class Podcast extends Audio {
    private int episodeNumber;
    private String guest;
    private String host;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void showAudio() {
        super.showAudio();
        System.out.println("Episode number: " + episodeNumber);
        System.out.println("Host(s): " + host);
        System.out.println("Guest(s): " + guest);
    }
}
