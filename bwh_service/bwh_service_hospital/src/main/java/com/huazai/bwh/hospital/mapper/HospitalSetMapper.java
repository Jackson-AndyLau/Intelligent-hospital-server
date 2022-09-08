package com.huazai.bwh.hospital.mapper;

import com.huazai.bwh.hospital.entity.HospitalSetEntity;
import com.huazai.bwh.hospital.dto.HospitalSetDTO;
import com.huazai.bwh.hospital.vo.HospitalSetVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital — HospitalSet 模块]
 * Description: [HospitalSet 类信息的Mapper持久层接口]
 * Created on:  2021-07-11
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Repository
public interface HospitalSetMapper extends BaseMapper<HospitalSetEntity> {

    /**
     * Description:[单表分页查询]
     *
     * @param hospitalSetDTO [实体]
     * @param page           [分页参数]
     * @return List<HospitalSet>
     * @date 2021-07-11
     * @author huazai
     */
    List<HospitalSetVO> selectPageWithHospitalSetDTO(Page page, @Param(value = "params") HospitalSetDTO hospitalSetDTO);
}
