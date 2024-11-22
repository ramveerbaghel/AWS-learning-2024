package org.learn.service;

import org.learn.request.StudentFinalRequest;
import org.learn.response.StudentFinalResponse;

public interface StudentService {

    StudentFinalResponse saveStudentData(StudentFinalRequest input);
}
