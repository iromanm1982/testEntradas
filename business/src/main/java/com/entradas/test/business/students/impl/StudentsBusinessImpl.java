package com.entradas.test.business.students.impl;

import com.entradas.test.business.students.IStudentsBusiness;
import com.entradas.test.business.students.dto.StudentsDto;
import com.entradas.test.repository.students.StudentsRepository;
import com.entradas.test.repository.students.dto.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
@Service
public class StudentsBusinessImpl implements IStudentsBusiness {

    private StudentsRepository studentsRepository;

    @Override
    public List<StudentsDto> retrieveStudents(String name) {
        return mapperStudents(studentsRepository.findByLastName(name));
    }

    @Override
    public void createStudents(StudentsDto studentsDto) {
        studentsRepository.save(mapperStudentsDto(studentsDto));
    }

    private List<StudentsDto> mapperStudents(List<Students> studentsList) {

        List<StudentsDto> responseList = new ArrayList<>();
        studentsList.stream().forEach(students -> responseList.add(mapperStudents(students)));
        return responseList;
    }

    private StudentsDto mapperStudents(Students students) {

        StudentsDto studentsDto = new StudentsDto();
        studentsDto.setFirstName(students.getFirstName());
        studentsDto.setLastName(students.getLastName());
        studentsDto.setId(students.getId());
        studentsDto.setPassword(students.getPassword());
        studentsDto.setToken(students.getToken());

        return studentsDto;
    }

    private List<Students> mapperStudentsDtp(List<StudentsDto> studentsList) {

        List<Students> responseList = new ArrayList<>();
        studentsList.stream().forEach(students -> responseList.add(mapperStudentsDto(students)));
        return responseList;
    }

    private Students mapperStudentsDto(StudentsDto students) {

        Students studentsDto = new Students();
        studentsDto.setFirstName(students.getFirstName());
        studentsDto.setLastName(students.getLastName());
        studentsDto.setId(students.getId());
        studentsDto.setPassword(students.getPassword());
        studentsDto.setToken(students.getToken());

        return studentsDto;
    }
}
