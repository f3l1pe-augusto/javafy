package br.com.fakecompany.javafy.calculus;

public class RecomendationFilter {

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() <= 2) {
            System.out.println("Give it a chance.");
        } else if (classifiable.getClassification() <= 4) {
            System.out.println("Very well-rated.");
        } else {
            System.out.println("One of our favorites!");
        }
    }
}
