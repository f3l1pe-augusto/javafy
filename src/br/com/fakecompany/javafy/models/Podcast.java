package br.com.fakecompany.javafy.models;

import br.com.fakecompany.javafy.calculus.Classifiable;

public class Podcast extends Audio implements Classifiable {
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
        System.out.println("Avaliation: " + getClassification());
    }

    @Override
    public int getClassification() {
        if (getLikes() < 10000) {
            return 2;
        } else if (getLikes() < 100000) {
            return 3;
        } else if (getLikes() < 1000000) {
            return 4;
        } else {
            return 5;
        }
    }
}
