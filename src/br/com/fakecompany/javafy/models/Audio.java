package br.com.fakecompany.javafy.models;

public class Audio {
    private String title;
    private int durationInSeconds;
    private int totalPlays;
    private  int likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void like() {
        likes++;
    }

    public void play() {
        totalPlays++;
    }

    public void showAudio() {
        System.out.println("\nTitle: " + title);
        System.out.println("Total plays: " + totalPlays);
        System.out.println("Total likes: " + likes);
        System.out.println("Duration in seconds: " + durationInSeconds);
    }
}
