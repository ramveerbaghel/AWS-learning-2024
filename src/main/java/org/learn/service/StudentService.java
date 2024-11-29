package org.learn.service;

import com.amazonaws.services.lambda.runtime.Context;
import org.learn.request.StudentFinalRequest;
import org.learn.response.StudentFinalResponse;

public interface StudentService {

    StudentFinalResponse saveStudentData(StudentFinalRequest input, Context context);
}
