/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Publisher {
    private String name;
    private String address;
    private Classic[] classicsCatalog;

    public Publisher(String name, String address, Classic[] classicsCatalog) {
        this.name = name;
        this.address = address;
        this.classicsCatalog = classicsCatalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classic[] getClassicsCatalog() {
        return classicsCatalog;
    }

    public void setClassicsCatalog(Classic[] classicsCatalog) {
        this.classicsCatalog = classicsCatalog;
    }

    public String printCatalog() {
        return "Method printCatalog called from Publisher";
    }
}
