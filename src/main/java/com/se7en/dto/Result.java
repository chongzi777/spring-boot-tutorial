package com.se7en.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by se7en on 2018-11-14
 */
public class Result {
  private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
  private int code;
  private boolean success;
  private String message;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object data;

  public static Result genSuccessResult(){
    return new Result()
            .setCode(ResultCode.SUCCESS)
            .setSuccess(true)
            .setMessage(DEFAULT_SUCCESS_MESSAGE);
  }

  public static Result genSuccessResult(Object data){
    return new Result()
            .setCode(ResultCode.SUCCESS)
            .setSuccess(true)
            .setMessage(DEFAULT_SUCCESS_MESSAGE)
            .setData(data);
  }

  public static Result genFailResult(String message){
    return new Result()
            .setCode(ResultCode.FAIL)
            .setSuccess(false)
            .setMessage(message);
  }

  public int getCode() {
    return code;
  }

  public Result setCode(ResultCode resultCode) {
    this.code = resultCode.getCode();
    return this;
  }

  public boolean isSuccess() {
    return success;
  }

  public Result setSuccess(boolean success) {
    this.success = success;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public Result setMessage(String message) {
    this.message = message;
    return this;
  }

  public Object getData() {
    return data;
  }

  public Result setData(Object data) {
    this.data = data;
    return this;
  }

  public enum ResultCode {
    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    private final int code;

    ResultCode(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }
  }

}
