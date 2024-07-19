/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private Author theAuthor;
    private Series mySeries;

    public Novel(String isbn, int publicationYear, int pages, String coverArt, String genre, Author theAuthor, Series mySeries) {
        super(isbn, publicationYear, pages, coverArt, genre);
        this.theAuthor = theAuthor;
        this.mySeries = mySeries;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }

    public String theme() {
        return "Method theme called from Novel";
    }
}

