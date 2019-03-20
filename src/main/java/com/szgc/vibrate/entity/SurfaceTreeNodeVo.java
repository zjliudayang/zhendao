package com.szgc.vibrate.entity;

import com.szgc.vibrate.common.entity.ITreeNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Description: 仓面树形结构模型
 * @Author: liuyang
 * @Date: 2019-03-19 09:45
 */
@ApiModel(description = "仓面树形结构模型")
public class SurfaceTreeNodeVo extends SurfaceVo implements ITreeNode<SurfaceTreeNodeVo> {
    /**
     * 下级仓面
     */
    @ApiModelProperty(value = "下级仓面")
    private List<SurfaceTreeNodeVo> children;

    @Override
    public void setChildren(List<SurfaceTreeNodeVo> children) {
        this.children = children;
    }

    @Override
    public List<SurfaceTreeNodeVo> getChildren() {
        return children;
    }

    @Override
    public String getId() {
        return this.getSurfaceId().toString();
    }

    @Override
    public String getPid() {
        return this.getParentId().toString();
    }

    @Override
    public int compareTo(SurfaceTreeNodeVo o) {
        if (o == this) {
            return 0;
        }
        String this_name = this.getName() != null ? this.getName() : StringUtils.EMPTY;
        String that_name = o.getName() != null ? o.getName() : StringUtils.EMPTY;
        return this_name.compareTo(that_name);
    }
}
