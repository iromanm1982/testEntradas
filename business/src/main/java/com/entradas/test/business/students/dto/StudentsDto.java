package com.entradas.test.business.students.dto;

import com.entradas.test.business.common.DataOutDto;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by muerte on 28/10/17.
 */
@Data
public class StudentsDto implements Serializable, DataOutDto{

    private Long id;
    private String user;
    private String password;
    private String firstName;
    private String lastName;
    private String token;
}
