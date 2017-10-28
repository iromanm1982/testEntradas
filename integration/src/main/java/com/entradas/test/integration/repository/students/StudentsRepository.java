package com.entradas.test.integration.repository.students;

import com.entradas.test.integration.dto.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

    List<Students> findByLastName(String lastName);
}