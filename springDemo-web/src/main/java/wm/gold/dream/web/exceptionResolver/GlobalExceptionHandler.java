package wm.gold.dream.web.exceptionResolver;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wangmeng
 * @Date: 2018/11/4 13:20
 * @Version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @Order(50)
    Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        e.printStackTrace();
        return e.getBindingResult().getAllErrors();
    }


    @ExceptionHandler(Exception.class)
    String handleMethodArgumentNotValidException(Exception e){
        e.printStackTrace();
        return "errorPage";
    }
}
