/*
 * File Name: University.java
 * Assignment: Lab 3 Exercise C
 * Completed by: Moiz Bhatti
 * Submission Date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Main {
    public static void main(String[] args) {
        Address professorAddress = new Address("118 Dark Street", "Calgary", "Alberta", "T33 ABC", "Canada");
        Address studentAddress = new Address("21 Steel Street", "Calgary", "Alberta", "T36 CBA", "Canada");
        Professor professor = new Professor("Dr. Stark Wayne", "403-222-3333", "swayne@gmail.com", professorAddress, Person.nextPersonalNumber((short) 1), "T100", 60000.0);
        Student student = new Student("Peter Parker", "403-543-5231", "pparker@gmail.com", studentAddress, Person.nextPersonalNumber((short) 2), "S14348001", professor, 90.0);
        

        System.out.println("Professor: " + professor.getName());
        System.out.println("Professor's Teacher Number: " + professor.getTeacherNumber());
        System.out.println("Professor's Salary: $" + professor.getSalary());
        System.out.println("Professor's Address: " + professor.getAddress().outputAsLabel());
        System.out.println("Is Professor's Address Valid? " + professor.hasValidAddress());
        System.out.println();
        System.out.println("Student: " + student.getName());
        System.out.println("Student's Student Number: " + student.getStudentNumber());
        System.out.println("Student's Average Mark: " + student.getAverageMark());
        System.out.println("Is Student Eligible to Enroll? " + student.isEligibleToEnroll());
        System.out.println("Student's Address: " + student.getAddress().outputAsLabel());
        System.out.println("Is Student's Address Valid? " + student.hasValidAddress());
        System.out.println("Student's Supervisor: " + student.getSupervisor().getName());
    }
}
