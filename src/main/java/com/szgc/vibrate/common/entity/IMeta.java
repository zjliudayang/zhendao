package com.szgc.vibrate.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 元数据
 *
 * @Auther: zhuyong
 * @Date: 2018-12-10 17:57
 * @Description:
 */
@ApiModel(description = "结果元数据接口")
public interface IMeta extends Serializable {

    /**
     * @return 时间戳
     */
    @ApiModelProperty(value = "时间戳", example = "1544512298463")
    long getTimestamp();
}
