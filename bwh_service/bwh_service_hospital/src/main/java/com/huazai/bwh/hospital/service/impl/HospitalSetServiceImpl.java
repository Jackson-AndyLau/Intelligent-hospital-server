package com.huazai.bwh.hospital.service.impl;

import com.huazai.bwh.hospital.entity.HospitalSetEntity;
import com.huazai.bwh.hospital.mapper.HospitalSetMapper;
import com.huazai.bwh.hospital.service.IHospitalSetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.huazai.bwh.common.exception.BwhException;

import com.huazai.bwh.hospital.vo.HospitalSetVO;
import com.huazai.bwh.hospital.dto.HospitalSetDTO;

import java.util.List;

/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital — HospitalSetEntity 模块]
 * Description: [HospitalSetEntity 类信息的ServiceImpl实现层]
 * Created on:  2021-07-11
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSetEntity> implements IHospitalSetService {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

    @Override
    public Page selectPageWithHospitalSetVO(HospitalSetDTO hospitalSetDTO) throws BwhException {
        Page page = new Page(hospitalSetDTO.getCurrent(), hospitalSetDTO.getSize());
        List<HospitalSetVO> hospitalSetVOList = hospitalSetMapper.selectPageWithHospitalSetDTO(page, hospitalSetDTO);
        page.setRecords(hospitalSetVOList);
        return page;
    }

    @Override
    public HospitalSetEntity selectHospitalSetById(String id) throws BwhException {

        return this.hospitalSetMapper.selectById(id);
    }

    @Override
    public void deleteHospitalSetById(String id) throws BwhException {

        this.hospitalSetMapper.deleteById(id);
    }

    @Override
    public void insertHospitalSet(HospitalSetEntity hospitalSet) throws BwhException {

        this.hospitalSetMapper.insert(hospitalSet);
    }

    @Override
    public void updateHospitalSetById(HospitalSetEntity hospitalSet) throws BwhException {

        this.hospitalSetMapper.updateById(hospitalSet);
    }
}
