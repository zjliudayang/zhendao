package com.szgc.vibrate.common.util;


import com.szgc.vibrate.common.entity.ITreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 树处理工具类
 *
 * @Auther: zhuyong
 * @Date: 2019-1-2 11:43
 * @Description:
 */
public final class TreeUtil {


    /**
     * 解析可扩展的树
     *
     * @param nodes 可扩展的树节点
     * @param <T>   实现了树节点接口的类类型
     * @return 树
     */
    public static <T extends ITreeNode<T>> List<T> parseExtendTree(Map<String, T> nodes) {
        List<T> trees = new ArrayList<>();
        if (nodes != null && !nodes.isEmpty()) {
            nodes.forEach((k, v) -> {
                T p = nodes.get(v.getPid());
                if (p != null) {
                    p.add(v);
                } else {
                    trees.add(v);
                }
            });
        }
        // 排序
        if (!trees.isEmpty()) {
            Collections.sort(trees);
            trees.forEach(T::sort);
        }
        return trees;
    }
}
