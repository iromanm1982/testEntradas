package com.entradas.test.business.students.dto;

import com.entradas.test.business.common.DataOutDto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by muerte on 28/10/17.
 */
@Data
public class ListStudentsDto implements Serializable, DataOutDto {

    private List<StudentsDto> studentsDtoList;
}
