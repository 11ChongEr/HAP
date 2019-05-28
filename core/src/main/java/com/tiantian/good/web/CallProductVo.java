package com.tiantian.good.web;

import java.io.Serializable;

/**
 * Mr.Fei
 * 2019-05-28 16:01:23
 */
public class CallProductVo implements Serializable {

    private static final long serialVersionUID = 1L;


    private String result;
    private String code;//S000A000
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
