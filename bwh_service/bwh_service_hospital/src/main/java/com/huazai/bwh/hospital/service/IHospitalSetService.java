package com.huazai.bwh.hospital.service;

import com.huazai.bwh.hospital.entity.HospitalSetEntity;
import com.huazai.bwh.hospital.dto.HospitalSetDTO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huazai.bwh.common.exception.BwhException;

/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital — HospitalSet 模块]
 * Description: [HospitalSet 类信息的Service层接口]
 * Created on:  2021-07-11
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
public interface IHospitalSetService extends IService<HospitalSetEntity> {

    /**
     * Description:[单表分页查询]
     *
     * @param hospitalSetDTO [实体]
     * @return Page<HospitalSetVO>
     * @throws BwhException
     * @date 2021-07-11
     * @author huazai
     */
    Page selectPageWithHospitalSetVO(HospitalSetDTO hospitalSetDTO) throws BwhException;

    /**
     * Description:[通过id获取实体信息]
     *
     * @param id [id]
     * @return HospitalSet
     * @throws BwhException
     * @date 2021-07-11
     * @author huazai
     */
    HospitalSetEntity selectHospitalSetById(String id) throws BwhException;

    /**
     * Description:[通过id删除实体信息]
     *
     * @param id [id]
     * @throws BwhException
     * @date 2021-07-11
     * @author huazai
     */
    void deleteHospitalSetById(String id) throws BwhException;

    /**
     * Description:[通过实体添加新的数据]
     *
     * @param hospitalSet [实体信息]
     * @throws BwhException
     * @date 2021-07-11
     * @author huazai
     */
    void insertHospitalSet(HospitalSetEntity hospitalSet) throws BwhException;

    /**
     * Description:[通过实体ID修改信息]
     *
     * @param hospitalSet [实体信息]
     * @throws BwhException
     * @date 2021-07-11
     * @author huazai
     */
    void updateHospitalSetById(HospitalSetEntity hospitalSet) throws BwhException;
}
