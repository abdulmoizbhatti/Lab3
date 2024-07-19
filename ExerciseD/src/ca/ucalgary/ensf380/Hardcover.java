/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public abstract class Hardcover extends Book {
    protected String binding;

    public Hardcover(String isbn, int publicationYear, int pages, String binding) {
        super(isbn, publicationYear, pages);
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }
}
