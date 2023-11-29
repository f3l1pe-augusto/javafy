package br.com.fakecompany.javafy.models;

import br.com.fakecompany.javafy.calculus.Classifiable;

public class AudioBook extends Audio implements Classifiable {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showAudio() {
        super.showAudio();
        System.out.println("Author(s): " + author);
        System.out.println("Avaliation: " + getClassification());
    }

    @Override
    public int getClassification() {
        if (getLikes() < 1000) {
            return 2;
        } else if (getLikes() < 10000) {
            return 3;
        } else if (getLikes() < 100000) {
            return 4;
        } else {
            return 5;
        }
    }
}
