package com.entradas.test.repository.students;

import com.entradas.test.repository.students.dto.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
public interface StudentsRepository extends CrudRepository<Students, Long> {

    List<Students> findByLastName(String lastName);
}