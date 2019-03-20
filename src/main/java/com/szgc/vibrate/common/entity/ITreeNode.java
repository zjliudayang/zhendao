package com.szgc.vibrate.common.entity;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 可扩展的树节点接口
 *
 * @Auther: zhuyong
 * @Date: 2018-10-21 02:12
 * @Description:
 */
public interface ITreeNode<T extends ITreeNode> extends INode<T> {

    /**
     * 设置下级
     *
     * @param children
     */
    void setChildren(List<T> children);

    /**
     * 获取下级
     *
     * @return 下级
     */
    @ApiModelProperty(value = "下级")
    List<T> getChildren();

    /**
     * 添加下级或子孙级节点
     *
     * @param node 下级或子孙级节点
     * @return 是否成功
     */
    @SuppressWarnings("unchecked")
    default boolean add(T node) {
        if (node == null) {
            return false;
        }
        if (getChildren() == null) {
            setChildren(new LinkedList<>());
        }
        List<T> children = getChildren();
        if (children == null) {
            return false;
        }
        if (StringUtils.equals(this.getId(), node.getPid())) {
            return children.add(node);
        } else {
            for (T next : children) {
                // 递归调用添加下级或子孙级节点
                if (next.add(node)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * 排序处理
     */
    @SuppressWarnings("unchecked")
    default void sort() {
        List<T> children = getChildren();
        if (children != null && !children.isEmpty()) {
            Collections.sort(children);
            children.forEach(ITreeNode::sort);
        }
    }
}
