package tech.madman.model;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {


    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResult<T> ok(){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        return commonResult;
    }

    public static <T> CommonResult<T> ok(T t){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setData(t);
        return commonResult;
    }

    public static <T> CommonResult<T> ok(T t, String msg){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setData(t);
        commonResult.setMsg(msg);
        return commonResult;
    }

    public static <T> CommonResult<T> badRequest(){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(500);
        return commonResult;
    }

    public static <T> CommonResult<T> badRequest(String msg){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(500);
        commonResult.setMsg(msg);
        return commonResult;
    }


    public static <T> CommonResult<T> badRequest(T t, String msg){
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(500);
        commonResult.setData(t);
        commonResult.setMsg(msg);
        return commonResult;
    }
}
