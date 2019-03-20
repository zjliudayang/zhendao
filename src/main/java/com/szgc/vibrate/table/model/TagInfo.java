package com.szgc.vibrate.table.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "CM_ZD_BACK_TAG_INFO")
@ApiModel(description = "")
public class TagInfo implements Serializable {
    @Id
    @Column(name = "TAG_ID")
    @ApiModelProperty(value = "")
    private Integer tagId;

    /**
     * 标签mac
     */
    @Column(name = "TAG_MAC")
    @ApiModelProperty(value = "标签mac")
    private String tagMac;

    /**
     * 标签名称
     */
    @Column(name = "TAG_NAME")
    @ApiModelProperty(value = "标签名称")
    private String tagName;

    /**
     * 仓面id
     */
    @Column(name = "SURFACE_ID")
    @ApiModelProperty(value = "仓面id")
    private Integer surfaceId;

    private static final long serialVersionUID = 1L;

    /**
     * @return TAG_ID
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取标签mac
     *
     * @return TAG_MAC - 标签mac
     */
    public String getTagMac() {
        return tagMac;
    }

    /**
     * 设置标签mac
     *
     * @param tagMac 标签mac
     */
    public void setTagMac(String tagMac) {
        this.tagMac = tagMac;
    }

    /**
     * 获取标签名称
     *
     * @return TAG_NAME - 标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置标签名称
     *
     * @param tagName 标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * 获取仓面id
     *
     * @return SURFACE_ID - 仓面id
     */
    public Integer getSurfaceId() {
        return surfaceId;
    }

    /**
     * 设置仓面id
     *
     * @param surfaceId 仓面id
     */
    public void setSurfaceId(Integer surfaceId) {
        this.surfaceId = surfaceId;
    }
}