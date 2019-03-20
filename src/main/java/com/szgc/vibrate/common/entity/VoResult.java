package com.szgc.vibrate.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 显示层对象数据模型
 *
 * @Author: zhuyong
 * @Date: Created in 22:52 2018/3/29
 */
@ApiModel(description = "结果模型")
public class VoResult<T> implements Serializable {
    private static final long serialVersionUID = -4675312075209176701L;
    /**
     * 是否成功
     */
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    /**
     * 错误消息
     */
    @ApiModelProperty(value = "错误消息")
    private String message;
    /**
     * 元数据
     */
    @ApiModelProperty(value = "元数据")
    private IMeta meta;
    /**
     * 业务数据
     */
    @ApiModelProperty(value = "业务数据")
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IMeta getMeta() {
        return meta;
    }

    public void setMeta(IMeta meta) {
        this.meta = meta;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
