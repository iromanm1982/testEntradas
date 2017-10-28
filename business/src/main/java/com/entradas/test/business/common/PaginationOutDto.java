package com.umbrella.tpv.businness.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by muerte on 16/03/17.
 */
@Data
public class PaginationOutDto implements Serializable {


    private static final long serialVersionUID = -741945381708519113L;

    private Integer size;

    private Integer next;

    private Long total;

    private Boolean moreResult;

    private String url;

}
