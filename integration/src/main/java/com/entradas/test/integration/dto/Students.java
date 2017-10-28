package com.entradas.test.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by muerte on 28/10/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "entradas")
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
