package com.szgc.vibrate.common.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 可扩展的节点接口
 *
 * @Auther: zhuyong
 * @Date: 2018-11-1 14:46
 * @Description:
 */
public interface INode<T> extends Comparable<T> {

    /**
     * 获取ID
     */
    @ApiModelProperty(value = "ID")
    String getId();

    /**
     * 获取PID
     */
    @ApiModelProperty(value = "PID")
    String getPid();
}
