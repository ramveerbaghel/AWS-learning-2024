package org.learn.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.learn.request.StudentFinalRequest;
import org.learn.response.StudentFinalResponse;
import org.learn.service.StudentService;

public class StudentHandler implements RequestHandler<StudentFinalRequest, StudentFinalResponse> {

    StudentService service;
    @Override
    public StudentFinalResponse handleRequest(StudentFinalRequest input, Context context) {
        if(null==input){
            return null;
        }
        return service.saveStudentData(input);
    }
}
