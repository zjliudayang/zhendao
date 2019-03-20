package com.szgc.vibrate.service;

import com.szgc.vibrate.common.entity.VoResult;
import com.szgc.vibrate.common.entity.VoResultFactory;
import com.szgc.vibrate.entity.SurfaceFo;
import com.szgc.vibrate.entity.SurfaceTreeNodeVo;
import com.szgc.vibrate.entity.SurfaceVo;
import com.szgc.vibrate.manager.SurfaceManager;
import com.szgc.vibrate.table.model.SurfaceInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.java2d.Surface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Description: 仓面服务
 * @Author: liuyang
 * @Date: 2019-03-18 16:38
 */
@Service
public class SurfaceService {

    @Autowired
    private SurfaceManager surfaceManager;

    /**
     * 查找指定仓面下的直接下级仓面
     *
     * @param surfaceId
     * @return
     */
    public VoResult<List<SurfaceTreeNodeVo>> findDirectSubSurfaceTreeNodes(Integer surfaceId) {
        return VoResultFactory.successResult(surfaceManager.findDirectSubSurfaceTreeNodes(surfaceId));
    }

    /**
     * 查找仓面树形列表
     *
     * @return
     */
    public VoResult<List<SurfaceTreeNodeVo>> findSurfaceTree() {
        return VoResultFactory.successResult(surfaceManager.findSurfaceTree());
    }

    /**
     * 查找指定仓面的子孙仓面树形列表
     *
     * @param surfaceId
     * @return
     */
    public VoResult<List<SurfaceTreeNodeVo>> findSurfaceTreeBySurfaceId(Integer surfaceId) {
        return VoResultFactory.successResult(surfaceManager.findSurfaceTreeBySurfaceId(surfaceId));
    }

    /**
     * 创建仓面数据
     *
     * @param surfaceFo
     * @return
     */
    public VoResult<Object> createSurface(SurfaceFo surfaceFo) {
        if (surfaceManager.ifSurfaceNameExist(surfaceFo.getName())) {
            return VoResultFactory.errorResult("已存在相同名称的仓面");
        }
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        BeanUtils.copyProperties(surfaceFo, surfaceInfo);
        surfaceInfo.setStartTime(stringToDate(surfaceFo.getStartTime()));
        surfaceInfo.setCloseTime(stringToDate(surfaceFo.getCloseTime()));
        return VoResultFactory.successResult(surfaceManager.createSurface(surfaceInfo));
    }


    private Date stringToDate(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 更新仓面数据
     *
     * @param surfaceId
     * @param surfaceFo
     * @return
     */
    public VoResult<Object> updateSurface(Integer surfaceId, SurfaceFo surfaceFo) {
        if (surfaceManager.ifSurfaceNameExistExceptSelf(surfaceFo.getName(), surfaceId)) {
            return VoResultFactory.errorResult("已存在相同名称的仓面");
        }
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        BeanUtils.copyProperties(surfaceFo, surfaceInfo);
        surfaceInfo.setSurfaceId(surfaceId);
        return VoResultFactory.successResult(surfaceManager.updateSurface(surfaceInfo));
    }

    /**
     * 删除仓面
     * @param surfaceId
     * @return
     */
    public VoResult<Object> deleteSurface(Integer surfaceId) {
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.setSurfaceId(surfaceId);
        surfaceInfo.setDeleteStatus(1);
        return VoResultFactory.successResult(surfaceManager.updateSurface(surfaceInfo));
    }

    /**
     * 查询仓面详情
     * @param surfaceId
     * @return
     */
    public VoResult<SurfaceVo> findSurface(Integer surfaceId) {
        SurfaceInfo surfaceInfo = surfaceManager.findSurface(surfaceId);
        SurfaceVo surfaceVo = new SurfaceVo();
        BeanUtils.copyProperties(surfaceInfo,surfaceVo);
        return VoResultFactory.successResult(surfaceVo);
    }
}
