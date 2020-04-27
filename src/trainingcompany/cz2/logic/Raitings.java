package trainingcompany.cz2.logic;

import java.util.Arrays;

public class Raitings {
    private static int MAX_NUMBER_OF_RATINGS = 5;
    private int currentNumberOfRatings;
    private int[] ratings;

    public Raitings() {
        this.ratings = new int[MAX_NUMBER_OF_RATINGS];
        this.currentNumberOfRatings = 0;
    }

    public void add(int rating) {
        if (currentNumberOfRatings >= MAX_NUMBER_OF_RATINGS) {
            System.err.println("student otrzymal maksymalna liczbe ocen ");
            return;
        }
        ratings[currentNumberOfRatings] = rating;
        currentNumberOfRatings++;
    }

    @Override
    public String toString() {
        return "\nRaitings{" +
                "ilosc ocen studenta to " + currentNumberOfRatings +
                ", oceny studenta= " + Arrays.toString(ratings) +
                '}';
    }
}
