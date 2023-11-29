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
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
