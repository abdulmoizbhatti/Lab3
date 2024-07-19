/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private Category deweyClassification;
    private String topic;

    public Nonfiction(String isbn, int publicationYear, int pages, Category deweyClassification, String topic) {
        super(isbn, publicationYear, pages);
        this.deweyClassification = deweyClassification;
        this.topic = topic;
    }

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDeweyClassificationMethod() {
        return "Method getDeweyClassification called from Nonfiction";
    }

    public String setDeweyClassificationMethod() {
        return "Method setDeweyClassification called from Nonfiction";
    }
}
