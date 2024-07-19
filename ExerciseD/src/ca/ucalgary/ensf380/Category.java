/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Category {
    private Category subCategory;
    private String category;

    public Category(String category) {
        this.category = category;
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String sort() {
        return "Method sort called from Category";
    }
}
