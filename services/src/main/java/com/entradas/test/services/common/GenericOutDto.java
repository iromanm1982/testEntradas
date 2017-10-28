package com.entradas.test.services.common;


import com.entradas.test.business.common.DataOutDto;
import com.entradas.test.business.common.PaginationOutDto;
import com.entradas.test.business.common.ResultOutDto;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by muerte on 16/03/17.
 */
@Data
public class GenericOutDto implements Serializable {


    private static final long serialVersionUID = 6216969898722868319L;

    private ResultOutDto result;

    private DataOutDto data;

    private PaginationOutDto pagination;

    public GenericOutDto() {
        result = ResultOutDto.ok();
    }

    public GenericOutDto with(ResultOutDto result) {
        this.result = result;
        return this;
    }

    public GenericOutDto with(DataOutDto data) {
        this.data = data;
        return this;
    }

    public GenericOutDto with(PaginationOutDto pagination){
        this.pagination = pagination;
        return this;
    }
}
