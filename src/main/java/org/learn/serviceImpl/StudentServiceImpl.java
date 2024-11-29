package org.learn.serviceImpl;

import com.amazonaws.services.lambda.runtime.Context;
import org.learn.common.MessageInfo;
import org.learn.dao.StudentDao;
import org.learn.request.StudentFinalRequest;
import org.learn.response.StudentFinalResponse;
import org.learn.service.StudentService;

public class StudentServiceImpl implements StudentService {
    StudentDao dao;
    @Override
    public StudentFinalResponse saveStudentData(StudentFinalRequest input, Context context) {
        context.getLogger().log("Inside serviceImpl .....");
        context.getLogger().log("Request : {}"+input.toString());
        MessageInfo messageInfo = new MessageInfo();
        StudentFinalResponse response = new StudentFinalResponse();
        messageInfo.setMsgCode("200");
        messageInfo.setMsgDescription("ok");
        messageInfo.setMsgStatus("success");
        response.setMsg(messageInfo);
        context.getLogger().log("Response :{}"+response.toString());
        return response;
    }
}
