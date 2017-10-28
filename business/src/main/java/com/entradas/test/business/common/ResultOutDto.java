package com.umbrella.tpv.businness.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * Created by muerte on 16/03/17.
 */
@Data
public class ResultOutDto implements Serializable {

    private static final long serialVersionUID = -1870182404874127833L;

    private Integer code;

    private String description;

    private String internalErrorCode;

    public static ResultOutDto created(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.CREATED.value());
        result.setDescription(HttpStatus.CREATED.getReasonPhrase());
        return result;
    }

    public static ResultOutDto ok(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.OK.value());
        result.setDescription(HttpStatus.OK.getReasonPhrase());
        return result;
    }


    public static ResultOutDto badRequest(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.BAD_REQUEST.value());
        result.setDescription(HttpStatus.BAD_REQUEST.getReasonPhrase());
        return result;
    }

    public static ResultOutDto unauthorized(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.UNAUTHORIZED.value());
        result.setDescription(HttpStatus.UNAUTHORIZED.getReasonPhrase());
        return result;
    }

    public static ResultOutDto internalError(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        result.setDescription(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return result;
    }

    public static ResultOutDto notFound(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.NOT_FOUND.value());
        result.setDescription(HttpStatus.NOT_FOUND.getReasonPhrase());
        return result;
    }

    public static ResultOutDto accepted(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.ACCEPTED.value());
        result.setDescription(HttpStatus.ACCEPTED.getReasonPhrase());
        return result;
    }


    public static ResultOutDto preconditionsFailed(){
        ResultOutDto result = new ResultOutDto();

        result.setCode(HttpStatus.PRECONDITION_FAILED.value());
        result.setDescription(HttpStatus.PRECONDITION_FAILED.getReasonPhrase());
        return result;
    }
}
