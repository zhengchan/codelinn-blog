package com.codelinn.blog.aspect;

import com.codelinn.blog.common.BaseException;
import com.codelinn.blog.common.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class Name : com.codelinn.blog.aspect
 * Description :全局异常处理类
 *
 * @author : cailinfeng
 * Date : 2018/9/5 15:32
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // 处理Controller中抛出的异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultEntity handle(Exception e){
        if(e instanceof BaseException){
            BaseException baseException = (BaseException) e;
            return ResultEntity.error(baseException.getCode(), baseException.getMessage());
        }
        // 打印其他异常的日志信息
        logger.error("【系统异常】{}",e);
        // 其他的非getAge()抛出的异常返回信息
        return ResultEntity.error(-1, "unknow error");
    }
}
