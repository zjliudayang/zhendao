package com.szgc.vibrate.common.entity;


import org.springframework.validation.BindingResult;

/**
 * 返回结果工厂
 *
 * @author zhuyong
 * @date 2017年9月13日
 */
public class VoResultFactory {

    /**
     * 错误返回结果
     *
     * @param message 错误消息
     * @param <T>     业务数据类型
     * @return 结果
     */
    public static <T> VoResult<T> errorResult(String message) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(false);
        r.setMeta(new DefaultMeta());
        r.setMessage(message);
        return r;
    }

    /**
     * 错误返回结果
     *
     * @param result 校验错误结果
     * @param <T>    业务数据类型
     * @return 结果
     */
    public static <T> VoResult<T> errorResult(BindingResult result) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(false);
        r.setMeta(new DefaultMeta());
        if (result.getAllErrors() != null && !result.getAllErrors().isEmpty()) {
            r.setMessage(result.getAllErrors().get(0).getDefaultMessage());
        } else {
            r.setMessage("unknown error!");
        }
        return r;
    }

    /**
     * 错误返回结果
     *
     * @param meta    元数据
     * @param message 错误消息
     * @param <T>     业务数据模型类
     * @return 结果
     */
    public static <T> VoResult<T> errorResult(IMeta meta, String message) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(false);
        r.setMeta(meta);
        r.setMessage(message);
        return r;
    }

    /**
     * 错误返回结果
     *
     * @param meta   元数据
     * @param result 校验错误结果
     * @param <T>    业务数据模型类
     * @return 结果
     */
    public static <T> VoResult<T> errorResult(IMeta meta, BindingResult result) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(false);
        r.setMeta(meta);
        if (result.getAllErrors() != null && !result.getAllErrors().isEmpty()) {
            r.setMessage(result.getAllErrors().get(0).getDefaultMessage());
        } else {
            r.setMessage("unknown error!");
        }
        return r;
    }

    /**
     * 正确返回结果
     *
     * @param <T> 业务数据类型
     * @return 结果
     */
    public static <T> VoResult<T> successResult() {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(true);
        r.setMeta(new DefaultMeta());
        return r;
    }

    /**
     * 正确返回结果
     *
     * @param data 结果数据
     * @param <T>  业务数据类型
     * @return 结果
     */
    public static <T> VoResult<T> successResult(T data) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(true);
        r.setMeta(new DefaultMeta());
        r.setData(data);
        return r;
    }

    /**
     * 正确返回结果
     *
     * @param data    结果数据
     * @param message 成功消息
     * @param <T>     业务数据类型
     * @return 结果
     */
    public static <T> VoResult<T> successResult(T data, String message) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(true);
        r.setMeta(new DefaultMeta());
        r.setData(data);
        r.setMessage(message);
        return r;
    }

    /**
     * 正确返回结果
     *
     * @param meta 元数据
     * @param data 结果数据
     * @param <T>  业务数据模型类
     * @return 结果
     */
    public static <T> VoResult<T> successResult(IMeta meta, T data) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(true);
        r.setMeta(meta);
        r.setData(data);
        return r;
    }

    /**
     * 正确返回结果
     *
     * @param meta    元数据
     * @param data    结果数据
     * @param message 成功消息
     * @param <T>     业务数据模型类
     * @return 结果
     */
    public static <T> VoResult<T> successResult(IMeta meta, T data, String message) {
        VoResult<T> r = new VoResult<>();
        r.setSuccess(true);
        r.setMeta(meta);
        r.setData(data);
        r.setMessage(message);
        return r;
    }
}
