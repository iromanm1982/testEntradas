package com.entradas.test.business.students;

import com.entradas.test.business.students.dto.ListStudentsDto;
import com.entradas.test.business.students.dto.StudentsDto;

/**
 * Created by muerte on 28/10/17.
 */
public interface IStudentsBusiness {

    ListStudentsDto retrieveStudents(String name);

    StudentsDto retrieveStudent(String user, String password);

    void createStudents(StudentsDto students);
}
