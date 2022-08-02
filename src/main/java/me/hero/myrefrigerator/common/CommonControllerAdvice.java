package me.hero.myrefrigerator.common;

import lombok.extern.slf4j.Slf4j;
import me.hero.myrefrigerator.common.dto.CommonResponse;
import me.hero.myrefrigerator.exception.ConstraintViolationException;
import me.hero.myrefrigerator.exception.InvalidParamException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static me.hero.myrefrigerator.common.ErrorCode.*;

@Slf4j
@ControllerAdvice
public class CommonControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public CommonResponse onException(Exception e) {
        log.error("[ {} ] : {}", e.getClass(), e.getMessage());
        return CommonResponse.fail("알 수 없는 에러가 발생 하였습니다.", SERVER_ERROR.getCode());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public CommonResponse onConstraintViolationException(ConstraintViolationException e) {
        log.error("[ {} ] : {}", e.getClass(), e.getMessage());
        return CommonResponse.fail(e.getMessage(), CONSTRAINT_VIOLATION.getCode());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public CommonResponse onInvalidParamException(InvalidParamException e) {
        log.error("[ {} ] : {}", e.getClass(), e.getMessage());
        return CommonResponse.fail(e.getMessage(), INVALID_PARAM.getCode());
    }

}
