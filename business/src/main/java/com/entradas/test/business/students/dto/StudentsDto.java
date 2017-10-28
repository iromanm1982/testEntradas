package com.entradas.test.business.students.dto;

import lombok.Data;

/**
 * Created by muerte on 28/10/17.
 */
@Data
public class StudentsDto {

    private Long id;
    private String user;
    private String password;
    private String firstName;
    private String lastName;
    private String token;
}
