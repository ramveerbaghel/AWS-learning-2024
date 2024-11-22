package org.learn.pojo;

public class Student {
    private String firstName;
    private String lastName;
    private String studentDob;
    private String studentEmail;
    private String studentMobile;
    private Address studentAddress;

    public Student(String firstName, String lastName, String studentDob, String studentEmail, String studentMobile, Address studentAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentDob = studentDob;
        this.studentEmail = studentEmail;
        this.studentMobile = studentMobile;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentDob='" + studentDob + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



}
