package org.learn.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.learn.request.StudentFinalRequest;
import org.learn.response.StudentFinalResponse;
import org.learn.service.StudentService;
import org.learn.serviceImpl.StudentServiceImpl;

public class StudentHandler implements RequestHandler<StudentFinalRequest, StudentFinalResponse> {

    @Override
    public StudentFinalResponse handleRequest(StudentFinalRequest input, Context context) {
        StudentService service = new StudentServiceImpl();
        if(null==input){
            context.getLogger().log("Request is null ...");
            return null;
        }
        context.getLogger().log("Handler started ....");
        return service.saveStudentData(input,context);
    }
}
