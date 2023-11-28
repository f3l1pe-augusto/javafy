package br.com.fakecompany.javafy.models;

public class Music extends Audio {
    private String singer;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public void showAudio() {
        super.showAudio();
        System.out.println("Singer(s): " + singer);
    }
}
