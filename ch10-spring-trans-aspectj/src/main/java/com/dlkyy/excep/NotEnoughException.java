package com.dlkyy.excep;

/**
 * Created by dlkyy on 2021/3/5 20:52
 *
 * 自定义运行时异常
 */
public class NotEnoughException extends RuntimeException {
    public NotEnoughException(){

    }
    public NotEnoughException(String message) {
        super(message);
    }
}
