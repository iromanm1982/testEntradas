package com.entradas.test.repository.students.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by muerte on 28/10/17.
 */
@Data
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String user;
    private String password;
    private String firstName;
    private String lastName;
    private String token;


}
