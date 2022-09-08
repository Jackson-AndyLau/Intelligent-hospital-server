package com.huazai.bwh.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 全局统一返回结果类
 */
@Data
@ApiModel(value = "全局统一返回实体")
public class JSONResult<T> {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "消息")
    private String message;

    @ApiModelProperty(value = "数据")
    private T data;

    public JSONResult() {
    }

    protected static <T> JSONResult<T> build(T data) {
        JSONResult<T> result = new JSONResult<T>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> JSONResult<T> build(T body, ResultCodeEnum resultCodeEnum) {
        JSONResult<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> JSONResult<T> build(Integer code, String message) {
        JSONResult<T> result = build(null);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> JSONResult<T> success() {
        return JSONResult.success(null);
    }

    /**
     * 操作成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> JSONResult<T> success(T data) {
        JSONResult<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> JSONResult<T> failure() {
        return JSONResult.failure(null);
    }

    /**
     * 操作失败
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> JSONResult<T> failure(T data) {
        JSONResult<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }

    public JSONResult<T> message(String msg) {
        this.setMessage(msg);
        return this;
    }

    public JSONResult<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    public boolean isSuccess() {
        if (this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }
}
