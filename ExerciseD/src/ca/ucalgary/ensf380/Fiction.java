/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Fiction extends Paperback {
    private String genre;

    public Fiction(String isbn, int publicationYear, int pages, String coverArt, String genre) {
        super(isbn, publicationYear, pages, coverArt);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCoverArtMethod() {
        return "Method getCoverArt called from Fiction";
    }

    public String setCoverArtMethod() {
        return "Method setCoverArt called from Fiction";
    }

    public String getGenreMethod() {
        return "Method getGenre called from Fiction";
    }

    public String setGenreMethod() {
        return "Method setGenre called from Fiction";
    }
}
