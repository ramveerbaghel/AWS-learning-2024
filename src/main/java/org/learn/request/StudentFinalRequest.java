package org.learn.request;

import org.learn.pojo.Student;

public class StudentFinalRequest {

    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentFinalRequest() {
    }

    public StudentFinalRequest(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentFinalRequest{" +
                "student=" + student +
                '}';
    }

}
