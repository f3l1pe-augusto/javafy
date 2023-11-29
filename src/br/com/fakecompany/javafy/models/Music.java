package br.com.fakecompany.javafy.models;

import br.com.fakecompany.javafy.calculus.Classifiable;

public class Music extends Audio implements Classifiable {
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
