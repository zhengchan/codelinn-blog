package com.codelinn.blog.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Class Name : com.codelinn.blog.common
 * Description :公共异常
 *
 * @author : cailinfeng
 * Date : 2018/9/5 15:33
 */
public class BaseException extends RuntimeException {

    @Getter
    @Setter
    private Integer code;

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
