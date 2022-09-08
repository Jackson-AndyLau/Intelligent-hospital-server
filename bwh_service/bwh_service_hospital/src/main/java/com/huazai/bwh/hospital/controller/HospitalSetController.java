package com.huazai.bwh.hospital.controller;

import com.huazai.bwh.common.result.ResultCodeEnum;
import org.springframework.web.bind.annotation.*;
import com.huazai.bwh.common.constant.GlobalConstant;
import com.huazai.bwh.common.exception.BwhException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.huazai.bwh.hospital.dto.HospitalSetDTO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.huazai.bwh.hospital.service.IHospitalSetService;
import com.huazai.bwh.common.result.JSONResult;
import com.huazai.bwh.hospital.entity.HospitalSetEntity;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.*;


/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital — HospitalSetEntity 模块]
 * Description: [HospitalSetEntity 类信息的controller层接口]
 * Created on:  2021-07-11
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Slf4j
@RestController
@Api(value = "HospitalSetEntity 控制器")
@RequestMapping("/hospital/hospitalSet")
public class HospitalSetController {

    @Autowired
    private IHospitalSetService hospitalSetService;

    /**
     * Description:[单表分页查询]
     *
     * @param hospitalSetDTO [实体]
     * @return JSONResult
     * @date 2021-07-11
     * @author huazai
     */
    @PostMapping("/getHospitalSetList")
    @ApiOperation(value = "/getHospitalSetList", notes = "获取分页列表")
    public JSONResult getHospitalSetList(@RequestBody @ApiParam(name = "HospitalSetDTO", value = "HospitalSetDTO 实体类") HospitalSetDTO hospitalSetDTO) {
        Page page;
        try {
            page = this.hospitalSetService.selectPageWithHospitalSetVO(hospitalSetDTO);
        } catch (BwhException e) {
            log.info(GlobalConstant.EXCEPTION_INFO, e);
            return JSONResult.failure(e.getMessage());
        }
        return JSONResult.success(page);
    }

    /**
     * Description:[通过id获取实体信息]
     *
     * @param id [id]
     * @return JSONResult
     * @date 2021-07-11
     * @author huazai
     */
    @GetMapping("/getHospitalSetById")
    @ApiOperation(value = "/getHospitalSetById", notes = "通过id获取HospitalSet")
    public JSONResult getHospitalSetById(@RequestParam(name = "id") @ApiParam(name = "id", value = "HospitalSetID", required = true) String id) {
        HospitalSetEntity hospitalSet;
        try {
            hospitalSet = this.hospitalSetService.selectHospitalSetById(id);
        } catch (BwhException e) {
            log.info(GlobalConstant.EXCEPTION_INFO, e);
            return JSONResult.failure(e.getMessage());
        }
        return JSONResult.success(hospitalSet);
    }

    /**
     * Description:[通过id删除实体信息]
     *
     * @param id [id]
     * @return JSONResult
     * @date 2021-07-11
     * @author huazai
     */
    @DeleteMapping("/deleteHospitalSetById")
    @ApiOperation(value = "/deleteHospitalSetById", notes = "通过id删除HospitalSet")
    public JSONResult deleteHospitalSetById(@RequestParam(name = "id") @ApiParam(name = "id", value = "HospitalSetID", required = true) String id) {
        try {
            this.hospitalSetService.deleteHospitalSetById(id);
        } catch (BwhException e) {
            log.info(GlobalConstant.EXCEPTION_INFO, e);
            return JSONResult.failure(e.getMessage());
        }
        return JSONResult.success();
    }

    /**
     * Description:[通过实体ID修改信息]
     *
     * @param hospitalSet [实体信息]
     * @return JSONResult
     * @date 2021-07-11
     * @author huazai
     */
    @PutMapping("/updateHospitalSetById")
    @ApiOperation(value = "/updateHospitalSetById", notes = "通过id更新HospitalSet")
    public JSONResult updateHospitalSetById(@RequestBody @ApiParam(name = "HospitalSet", value = "HospitalSet 实体类") HospitalSetEntity hospitalSet) {
        try {
            this.hospitalSetService.updateHospitalSetById(hospitalSet);
        } catch (BwhException e) {
            log.info(GlobalConstant.EXCEPTION_INFO, e);
            return JSONResult.failure(e.getMessage());
        }
        return JSONResult.success();
    }

    /**
     * Description:[通过实体添加新的数据]
     *
     * @param hospitalSet [实体信息]
     * @return JSONResult
     * @date 2021-07-11
     * @author huazai
     */
    @PostMapping("/addHospitalSet")
    @ApiOperation(value = "/addHospitalSet", notes = "添加HospitalSet")
    public JSONResult addHospitalSet(@RequestBody @ApiParam(name = "HospitalSet", value = "HospitalSet 实体类") HospitalSetEntity hospitalSet) {
        try {
            this.hospitalSetService.insertHospitalSet(hospitalSet);
        } catch (BwhException e) {
            log.info(GlobalConstant.EXCEPTION_INFO, e);
            return JSONResult.failure(e.getMessage());
        }
        return JSONResult.success();
    }
}
