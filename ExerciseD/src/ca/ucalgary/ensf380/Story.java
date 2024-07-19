/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Story {
    private Author[] theAuthors;

    public Story(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public String plot() {
        return "Method plot called from Story";
    }
}
