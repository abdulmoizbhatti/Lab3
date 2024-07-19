/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] stories;

    public Anthology(String isbn, int publicationYear, int pages, String coverArt, String genre, Story[] stories) {
        super(isbn, publicationYear, pages, coverArt, genre);
        this.stories = stories;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }
}
