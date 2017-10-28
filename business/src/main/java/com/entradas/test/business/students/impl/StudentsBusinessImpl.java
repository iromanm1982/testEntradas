package com.entradas.test.business.students.impl;

import com.entradas.test.business.students.IStudentsBusiness;
import com.entradas.test.business.students.dto.ListStudentsDto;
import com.entradas.test.business.students.dto.StudentsDto;
import com.entradas.test.integration.dto.Students;
import com.entradas.test.integration.repository.students.StudentsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
@Data
@Service
public class StudentsBusinessImpl implements IStudentsBusiness {

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public ListStudentsDto retrieveStudents(String name) {
        return mapperStudents(studentsRepository.findByLastName(name));
    }

    @Override
    public void createStudents(StudentsDto studentsDto) {
        studentsRepository.save(mapperStudentsDto(studentsDto));
    }

    private ListStudentsDto mapperStudents(List<Students> studentsList) {

        ListStudentsDto listStudentsDto = new ListStudentsDto();
        List<StudentsDto> responseList = new ArrayList<>();
        studentsList.stream().forEach(students -> responseList.add(mapperStudents(students)));
        listStudentsDto.setStudentsDtoList(responseList);
        return listStudentsDto;
    }

    private StudentsDto mapperStudents(Students students) {

        StudentsDto studentsDto = new StudentsDto();
        studentsDto.setFirstName(students.getFirstName());
        studentsDto.setLastName(students.getLastName());
        studentsDto.setId(students.getId());
        studentsDto.setPassword(students.getPassword());
        studentsDto.setToken(students.getToken());
        studentsDto.setUser(students.getUser());

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
        studentsDto.setToken(DigestUtils.md5DigestAsHex(students.getFirstName().getBytes()).toUpperCase());
        studentsDto.setUser(students.getUser());
        return studentsDto;
    }
}
