package com.entradas.test.business.students;

import com.entradas.test.business.students.dto.StudentsDto;

import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
public interface IStudentsBusiness {

    List<StudentsDto> retrieveStudents(String name);

    void createStudents(StudentsDto students);
}
