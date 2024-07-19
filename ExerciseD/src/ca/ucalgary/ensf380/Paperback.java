/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public abstract class Paperback extends Book {
    protected String coverArt;

    public Paperback(String isbn, int publicationYear, int pages, String coverArt) {
        super(isbn, publicationYear, pages);
        this.coverArt = coverArt;
    }

    public String getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }
}
