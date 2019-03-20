package com.szgc.vibrate.dao;

import com.szgc.vibrate.entity.SurfaceTreeNodeVo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description: 仓面dao
 * @Author: liuyang
 * @Date: 2019-03-18 16:42
 */
public interface SurfaceDao {

    /**
     * 查找指定仓面下的直接下级仓面
     * @param surfaceId
     * @return
     */
    List<SurfaceTreeNodeVo> findDirectSubSurfaceTreeNodes(@Param("surfaceId") Integer surfaceId);

    /**
     * 查找仓面树形列表
     * @return
     */
    @MapKey("surfaceId")
    Map<Integer,SurfaceTreeNodeVo> findSurfaceTree();

    /**
     * 查找指定仓面的子孙仓面树形列表
     * @return
     * @param surfaceId
     */
    @MapKey("surfaceId")
    Map<Integer,SurfaceTreeNodeVo> findSurfaceTreeBySurfaceId(Integer surfaceId);
}
