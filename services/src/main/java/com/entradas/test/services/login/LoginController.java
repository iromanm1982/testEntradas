package com.entradas.test.services.login;

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
@RequestMapping(value="/login")
public class LoginController {

    @Autowired
    private IStudentsBusiness studentsBusiness;

    @RequestMapping(method = RequestMethod.POST)
    public GenericOutDto createStudents(@RequestParam(name = "user") String user,@RequestParam(name = "password") String password ){
        GenericOutDto response = new GenericOutDto();
        return response.with(studentsBusiness.retrieveStudent(user, password));
    }

    @RequestMapping(method =  RequestMethod.DELETE)
    public GenericOutDto retrieveStudents(@RequestParam(name = "name") String name){

        return null;
    }

}
