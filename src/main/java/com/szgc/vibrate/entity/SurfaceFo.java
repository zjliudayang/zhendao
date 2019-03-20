package com.szgc.vibrate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description: 新建仓面表单
 * @Author: liuyang
 * @Date: 2019-03-19 15:22
 */
@ApiModel(description = "新建仓面表单")
public class SurfaceFo {
    /**
     * 仓面名称
     */
    @ApiModelProperty(value = "仓面名称")
    @NotEmpty(message = "仓面名称必填")
    private String name;

    /**
     * 父id
     */
    @ApiModelProperty(value = "父id")
    @NotNull(message = "父id必填")
    private Integer parentId;

    /**
     * 仓面坐标点序
     */
    @ApiModelProperty(value = "仓面坐标点序")
    @NotEmpty(message = "仓面坐标点序必填")
    private String coord;

    /**
     * 基站坐标点：DEF223:1 1 1,DEF223:1 1 1,
     */
    @ApiModelProperty(value = "基站坐标点：DEF223:1 1 1,DEF223:1 1 1,")
    @NotEmpty(message = "基站坐标点必填")
    private String baseCoord;

    /**
     * 仓面高程
     */
    @ApiModelProperty(value = "仓面高程")
    @NotNull(message = "仓面高程必填")
    private Float height;

    /**
     * 开仓时间
     */
    @ApiModelProperty(value = "开仓时间 yyyy-MM-dd HH:mm:ss")
    @NotEmpty(message = "开仓时间必填")
    private String startTime;

    /**
     * 关仓时间
     */
    @ApiModelProperty(value = "关仓时间 yyyy-MM-dd HH:mm:ss")
    @NotEmpty(message = "开仓时间必填")
    private String closeTime;


    /**
     * 仓面id路径
     */
    @ApiModelProperty(value = "仓面id路径")
    private String surfaceIdPath;

    /**
     * 仓面名称路径
     */
    @ApiModelProperty(value = "仓面名称路径")
    private String surfaceNamePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }

    public String getBaseCoord() {
        return baseCoord;
    }

    public void setBaseCoord(String baseCoord) {
        this.baseCoord = baseCoord;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getSurfaceIdPath() {
        return surfaceIdPath;
    }

    public void setSurfaceIdPath(String surfaceIdPath) {
        this.surfaceIdPath = surfaceIdPath;
    }

    public String getSurfaceNamePath() {
        return surfaceNamePath;
    }

    public void setSurfaceNamePath(String surfaceNamePath) {
        this.surfaceNamePath = surfaceNamePath;
    }
}
