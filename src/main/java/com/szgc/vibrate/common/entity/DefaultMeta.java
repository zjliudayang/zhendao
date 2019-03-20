package com.szgc.vibrate.common.entity;

import io.swagger.annotations.ApiModel;

/**
 * 默认元数据
 *
 * @Auther: zhuyong
 * @Date: 2018-12-10 17:57
 * @Description:
 */
@ApiModel(description = "默认元数据")
public class DefaultMeta implements IMeta {
    private static final long serialVersionUID = -2126564783413213484L;

    @Override
    public long getTimestamp() {
        return System.currentTimeMillis();
    }
}
