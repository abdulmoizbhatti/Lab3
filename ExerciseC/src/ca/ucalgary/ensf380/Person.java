/*
 * File Name: University.java
 * Assignment: Lab 3 Exercise C
 * Completed by: Moiz Bhatti
 * Submission Date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private int lastPersonalNumber;

    public Person(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.lastPersonalNumber = lastPersonalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getLastPersonalNumber() {
        return lastPersonalNumber;
    }

    public void setLastPersonalNumber(int lastPersonalNumber) {
        this.lastPersonalNumber = lastPersonalNumber;
    }

    public static int nextPersonalNumber(short type) {
        return type * 100000 + (int) (System.currentTimeMillis() % 100000);
    }

    public boolean hasValidAddress() {
        return address.isValidated();
    }
}
