package com.example.demo.exceptiondemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author admin
 */
@ControllerAdvice
@ResponseBody
public class MyExceptionHandler {

    private static final Logger logger =
            LoggerFactory.getLogger(MyExceptionHandler.class);

//    @ExceptionHandler(MissingServletRequestParameterException.class)
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//
//    public JsonResult MissHadder(MissingServletRequestParameterException ex) {
//
//            logger.error("缺少请求参数，{}", ex.getMessage());
//            return new JsonResult("400", "缺少必要的请求参数");
//    }
//
//    @ExceptionHandler(NullPointerException.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public JsonResult
//    handleTypeMismatchException(NullPointerException ex) {
//        logger.error("空指针异常，{}", ex.getMessage());
//        return new JsonResult("500", "空指针异常了");
//    }


    @ExceptionHandler(MyException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult handleTypeMismatchException(MyException ex) {
        String code = ex.getCode();
        String message = ex.getMsg();
        return new JsonResult(code, message);

    }

}
