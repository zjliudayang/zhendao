package com.szgc.vibrate.table.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CM_ZD_BACK_SURFACE_INFO")
@ApiModel(description = "")
public class SurfaceInfo implements Serializable {
    @Id
    @Column(name = "SURFACE_ID")
    @ApiModelProperty(value = "")
    private Integer surfaceId;

    /**
     * 仓面名称
     */
    @Column(name = "NAME")
    @ApiModelProperty(value = "仓面名称")
    private String name;

    /**
     * 父id
     */
    @Column(name = "PARENT_ID")
    @ApiModelProperty(value = "父id")
    private Integer parentId;

    /**
     * 仓面坐标点序
     */
    @Column(name = "COORD")
    @ApiModelProperty(value = "仓面坐标点序")
    private String coord;

    /**
     * 基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     */
    @Column(name = "BASE_COORD")
    @ApiModelProperty(value = "基站坐标点：DEF223:1 1 1,DEF223:1 1 1,")
    private String baseCoord;

    /**
     * 仓面高程
     */
    @Column(name = "HEIGHT")
    @ApiModelProperty(value = "仓面高程")
    private Float height;

    /**
     * 开仓时间
     */
    @Column(name = "START_TIME")
    @ApiModelProperty(value = "开仓时间")
    private Date startTime;

    /**
     * 关仓时间
     */
    @Column(name = "CLOSE_TIME")
    @ApiModelProperty(value = "关仓时间")
    private Date closeTime;

    /**
     * 删除状态，0:未删除，1:已删除
     */
    @Column(name = "DELETE_STATUS")
    @ApiModelProperty(value = "删除状态，0:未删除，1:已删除")
    private Integer deleteStatus;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 仓面id路径
     */
    @Column(name = "SURFACE_ID_PATH")
    @ApiModelProperty(value = "仓面id路径")
    private String surfaceIdPath;

    /**
     * 仓面名称路径
     */
    @Column(name = "SURFACE_NAME_PATH")
    @ApiModelProperty(value = "仓面名称路径")
    private String surfaceNamePath;

    private static final long serialVersionUID = 1L;

    /**
     * @return SURFACE_ID
     */
    public Integer getSurfaceId() {
        return surfaceId;
    }

    /**
     * @param surfaceId
     */
    public void setSurfaceId(Integer surfaceId) {
        this.surfaceId = surfaceId;
    }

    /**
     * 获取仓面名称
     *
     * @return NAME - 仓面名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置仓面名称
     *
     * @param name 仓面名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父id
     *
     * @return PARENT_ID - 父id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父id
     *
     * @param parentId 父id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取仓面坐标点序
     *
     * @return COORD - 仓面坐标点序
     */
    public String getCoord() {
        return coord;
    }

    /**
     * 设置仓面坐标点序
     *
     * @param coord 仓面坐标点序
     */
    public void setCoord(String coord) {
        this.coord = coord;
    }

    /**
     * 获取基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     *
     * @return BASE_COORD - 基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     */
    public String getBaseCoord() {
        return baseCoord;
    }

    /**
     * 设置基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     *
     * @param baseCoord 基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     */
    public void setBaseCoord(String baseCoord) {
        this.baseCoord = baseCoord;
    }

    /**
     * 获取仓面高程
     *
     * @return HEIGHT - 仓面高程
     */
    public Float getHeight() {
        return height;
    }

    /**
     * 设置仓面高程
     *
     * @param height 仓面高程
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * 获取开仓时间
     *
     * @return START_TIME - 开仓时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开仓时间
     *
     * @param startTime 开仓时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取关仓时间
     *
     * @return CLOSE_TIME - 关仓时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置关仓时间
     *
     * @param closeTime 关仓时间
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取删除状态，0:未删除，1:已删除
     *
     * @return DELETE_STATUS - 删除状态，0:未删除，1:已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态，0:未删除，1:已删除
     *
     * @param deleteStatus 删除状态，0:未删除，1:已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取仓面id路径
     *
     * @return SURFACE_ID_PATH - 仓面id路径
     */
    public String getSurfaceIdPath() {
        return surfaceIdPath;
    }

    /**
     * 设置仓面id路径
     *
     * @param surfaceIdPath 仓面id路径
     */
    public void setSurfaceIdPath(String surfaceIdPath) {
        this.surfaceIdPath = surfaceIdPath;
    }

    /**
     * 获取仓面名称路径
     *
     * @return SURFACE_NAME_PATH - 仓面名称路径
     */
    public String getSurfaceNamePath() {
        return surfaceNamePath;
    }

    /**
     * 设置仓面名称路径
     *
     * @param surfaceNamePath 仓面名称路径
     */
    public void setSurfaceNamePath(String surfaceNamePath) {
        this.surfaceNamePath = surfaceNamePath;
    }
}