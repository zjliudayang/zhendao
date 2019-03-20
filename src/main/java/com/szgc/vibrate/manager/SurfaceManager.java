package com.szgc.vibrate.manager;

import com.szgc.vibrate.common.util.TreeUtil;
import com.szgc.vibrate.dao.SurfaceDao;
import com.szgc.vibrate.entity.SurfaceTreeNodeVo;
import com.szgc.vibrate.table.dao.SurfaceInfoMapper;
import com.szgc.vibrate.table.model.SurfaceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 仓面管理
 * @Author: liuyang
 * @Date: 2019-03-18 16:39
 */
@Component
public class SurfaceManager {

    @Autowired
    private SurfaceDao surfaceDao;

    @Autowired
    private SurfaceInfoMapper surfaceInfoMapper;

    /**
     * 查找指定仓面下的直接下级仓面
     *
     * @param surfaceId
     * @return
     */
    public List<SurfaceTreeNodeVo> findDirectSubSurfaceTreeNodes(Integer surfaceId) {
        return surfaceDao.findDirectSubSurfaceTreeNodes(surfaceId);
    }

    /**
     * 是否有同名仓面
     *
     * @param surfaceName
     * @return
     */
    public boolean ifSurfaceNameExist(String surfaceName) {
        Example example = new Example(SurfaceInfo.class);
        example.createCriteria().andEqualTo("name", surfaceName);
        return surfaceInfoMapper.selectCountByExample(example) > 0;
    }

    /**
     * 除了本仓面，是否还有同名仓面存在
     *
     * @param surfaceName
     * @return
     */
    public boolean ifSurfaceNameExistExceptSelf(String surfaceName, Integer surfaceId) {
        Example example = new Example(SurfaceInfo.class);
        example.createCriteria().andEqualTo("name", surfaceName)
                .andNotEqualTo("surfaceId", surfaceId);
        return surfaceInfoMapper.selectCountByExample(example) > 0;
    }

    /**
     * 查找仓面树形列表
     *
     * @return
     */
    public List<SurfaceTreeNodeVo> findSurfaceTree() {
        Map<Integer, SurfaceTreeNodeVo> nodes = surfaceDao.findSurfaceTree();
        if (nodes != null && !nodes.isEmpty()) {
            Map<String, SurfaceTreeNodeVo> map = new HashMap<>(16);
            nodes.forEach((k, v) -> map.put(v.getId(), v));
            return TreeUtil.parseExtendTree(map);
        }
        return new ArrayList<>();
    }

    /**
     * 查找指定仓面的子孙仓面树形列表
     *
     * @param surfaceId
     * @return
     */
    public List<SurfaceTreeNodeVo> findSurfaceTreeBySurfaceId(Integer surfaceId) {
        Map<Integer, SurfaceTreeNodeVo> nodes = surfaceDao.findSurfaceTreeBySurfaceId(surfaceId);
        if (nodes != null && !nodes.isEmpty()) {
            Map<String, SurfaceTreeNodeVo> map = new HashMap<>(16);
            nodes.forEach((k, v) -> map.put(v.getId(), v));
            return TreeUtil.parseExtendTree(map);
        }
        return new ArrayList<>();
    }

    /**
     * 创建仓面
     *
     * @param surfaceInfo
     * @return
     */
    public int createSurface(SurfaceInfo surfaceInfo) {
        return surfaceInfoMapper.insertSelective(surfaceInfo);
    }


    public int updateSurface(SurfaceInfo surfaceInfo) {
        return surfaceInfoMapper.updateByPrimaryKeySelective(surfaceInfo);
    }

    /**
     * 根据id查找仓面
     *
     * @param surfaceId
     * @return
     */
    public SurfaceInfo findSurface(Integer surfaceId) {
        return surfaceInfoMapper.selectByPrimaryKey(surfaceId);
    }
}
