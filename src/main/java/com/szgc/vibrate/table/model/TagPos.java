package com.szgc.vibrate.table.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "CM_ZD_BACK_TAG_POS")
@ApiModel(description = "")
public class TagPos implements Serializable {
    /**
     * 自增id
     */
    @Id
    @Column(name = "REL_ID")
    @ApiModelProperty(value = "自增id")
    private Long relId;

    /**
     * 标签Id
     */
    @Column(name = "TAG_ID")
    @ApiModelProperty(value = "标签Id")
    private Long tagId;

    /**
     * 标签位置列表
     */
    @Column(name = "TAG_POS")
    @ApiModelProperty(value = "标签位置列表")
    private byte[] tagPos;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增id
     *
     * @return REL_ID - 自增id
     */
    public Long getRelId() {
        return relId;
    }

    /**
     * 设置自增id
     *
     * @param relId 自增id
     */
    public void setRelId(Long relId) {
        this.relId = relId;
    }

    /**
     * 获取标签Id
     *
     * @return TAG_ID - 标签Id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置标签Id
     *
     * @param tagId 标签Id
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取标签位置列表
     *
     * @return TAG_POS - 标签位置列表
     */
    public byte[] getTagPos() {
        return tagPos;
    }

    /**
     * 设置标签位置列表
     *
     * @param tagPos 标签位置列表
     */
    public void setTagPos(byte[] tagPos) {
        this.tagPos = tagPos;
    }
}