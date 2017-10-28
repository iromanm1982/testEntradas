package com.entradas.test.services.students;

import com.entradas.test.business.common.ResultOutDto;
import com.entradas.test.business.students.IStudentsBusiness;
import com.entradas.test.business.students.dto.StudentsDto;
import com.entradas.test.services.common.GenericOutDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by muerte on 28/10/17.
 */
@RestController()
@RequestMapping(value="/students")
public class StudentsController {

    @Autowired
    private IStudentsBusiness studentsBusiness;

    @RequestMapping(method = RequestMethod.POST)
    public GenericOutDto createStudents(@RequestBody StudentsDto studentsDto){
        GenericOutDto response = new GenericOutDto();
        studentsBusiness.createStudents(studentsDto);
        return response.with(ResultOutDto.created());
    }

    @RequestMapping(method =  RequestMethod.GET)
    public GenericOutDto retrieveStudents(@RequestParam(name = "name") String name){
        GenericOutDto response = new GenericOutDto();
        response.with(studentsBusiness.retrieveStudents(name));

        return response;
    }

}
