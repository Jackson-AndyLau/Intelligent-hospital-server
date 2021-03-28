package com.huazai.bwh.common.result;

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(18200,"成功"),
    FAIL(18201, "失败"),
    PARAM_ERROR( 18202, "参数不正确"),
    SERVICE_ERROR(18203, "服务异常"),
    DATA_ERROR(18204, "数据异常"),
    DATA_UPDATE_ERROR(18205, "数据版本异常"),

    LOGIN_AUTH(18208, "未登陆"),
    PERMISSION(18209, "没有权限"),

    CODE_ERROR(18210, "验证码错误"),
    LOGIN_MOBLE_ERROR(18211, "账号不正确"),
    LOGIN_DISABLED_ERROR(18212, "改用户已被禁用"),
    REGISTER_MOBLE_ERROR(18213, "手机号已被使用"),
    LOGIN_AURH(18214, "需要登录"),
    LOGIN_ACL(18215, "没有权限"),

    URL_ENCODE_ERROR( 18216, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(18217, "非法回调请求"),
    FETCH_ACCESSTOKEN_FAILD(18218, "获取accessToken失败"),
    FETCH_USERINFO_ERROR(18219, "获取用户信息失败"),
    LOGIN_ERROR(1823005, "登录失败"),

    PAY_RUN(18220, "支付中"),
    CANCEL_ORDER_FAIL(18225, "取消订单失败"),
    CANCEL_ORDER_NO(18225, "不能取消预约"),

    HOSCODE_EXIST(18230, "医院编号已经存在"),
    NUMBER_NO(18240, "可预约号不足"),
    TIME_NO(18250, "当前时间不可以预约"),

    SIGN_ERROR(18200, "签名错误"),
    HOSPITAL_OPEN(18210, "医院未开通，暂时不能访问"),
    HOSPITAL_LOCK(18220, "医院被锁定，暂时不能访问");

    private Integer code;
    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
