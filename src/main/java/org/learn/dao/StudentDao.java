package org.learn.dao;

import org.learn.request.StudentFinalRequest;

public interface StudentDao {

    Boolean saveStudentDataToDB(StudentFinalRequest input);
}
