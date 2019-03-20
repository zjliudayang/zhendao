package com.szgc.vibrate.controller;

import com.szgc.vibrate.common.entity.VoResult;
import com.szgc.vibrate.common.entity.VoResultFactory;
import com.szgc.vibrate.entity.SurfaceFo;
import com.szgc.vibrate.entity.SurfaceTreeNodeVo;
import com.szgc.vibrate.entity.SurfaceVo;
import com.szgc.vibrate.service.SurfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Description: 仓面控制
 * @Author: liuyang
 * @Date: 2019-03-18 16:36
 */
@Api(tags = "仓面控制")
@RestController
public class SurfaceController {

    @Autowired
    private SurfaceService surfaceService;


    @ApiOperation(value = "查找指定仓面下的直接下级仓面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "surfaceId", value = "仓面ID",
                    required = true, paramType = "path", dataType = "Integer")
    })
    @GetMapping("/authc-api/vibrate/surfaces/{surfaceId}/sub-nodes")
    public VoResult<List<SurfaceTreeNodeVo>> findDirectSubSurfaceTreeNodes(
            @PathVariable("surfaceId") Integer surfaceId) {
        return surfaceService.findDirectSubSurfaceTreeNodes(surfaceId);
    }

    @ApiOperation(value = "查找仓面树形列表")
    @GetMapping("/authc-api/vibrate/surfaces/tree")
    public VoResult<List<SurfaceTreeNodeVo>> findSurfaceTree() {
        return surfaceService.findSurfaceTree();
    }

    @ApiOperation(value = "查找指定仓面的子孙仓面树形列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "surfaceId", value = "仓面ID",
                    required = true, paramType = "path", dataType = "Integer")
    })
    @GetMapping("/authc-api/vibrate/surfaces/{surfaceId}/tree")
    public VoResult<List<SurfaceTreeNodeVo>> findSurfaceTreeBySurfaceId(
            @PathVariable("surfaceId") Integer surfaceId
    ) {
        return surfaceService.findSurfaceTreeBySurfaceId(surfaceId);
    }

    @ApiOperation(value = "创建仓面数据")
    @PostMapping("/authc-api/vibrate/surfaces")
    public VoResult<Object> createSurface(
            @Valid @RequestBody SurfaceFo surfaceFo, BindingResult result
    ) {
        if (result.hasErrors()) {
            return VoResultFactory.errorResult(result);
        }
        return surfaceService.createSurface(surfaceFo);
    }

    @ApiOperation(value = "更新仓面数据")
    @PutMapping("/authc-api/vibrate/surfaces/{surfaceId}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "surfaceId", value = "仓面ID",
                    required = true, paramType = "path", dataType = "Integer")
    })
    public VoResult<Object> updateSurface(
            @PathVariable("surfaceId") Integer surfaceId,
            @Valid @RequestBody SurfaceFo surfaceFo, BindingResult result
    ) {
        if (result.hasErrors()) {
            return VoResultFactory.errorResult(result);
        }
        return surfaceService.updateSurface(surfaceId, surfaceFo);
    }

    @ApiOperation(value = "删除仓面数据")
    @DeleteMapping("/authc-api/vibrate/surfaces/{surfaceId}")
    public VoResult<Object> deleteSurface(
            @PathVariable("surfaceId") Integer surfaceId
    ) {
        return surfaceService.deleteSurface(surfaceId);
    }

    @ApiOperation(value = "查询仓面数据详情")
    @GetMapping("/authc-api/vibrate/surfaces/{surfaceId}")
    public VoResult<SurfaceVo> findSurface(
            @PathVariable("surfaceId") Integer surfaceId
    ) {
        return surfaceService.findSurface(surfaceId);
    }
}
