package com.huazai.bwh.hospital.dto;

import com.huazai.bwh.common.base.BaseDto;

import java.util.Date;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital — HospitalSetDTO 模块]
 * Description: [HospitalSetDTO 实体类]
 * Created on:  2021-07-11
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel
public class HospitalSetDTO extends BaseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医院名称
     */
    @ApiModelProperty(value = "医院名称")
    private String hosname;
    /**
     * 医院编号
     */
    @ApiModelProperty(value = "医院编号")
    private String hoscode;
    /**
     * api基础路径
     */
    @ApiModelProperty(value = "api基础路径")
    private String apiUrl;
    /**
     * 签名秘钥
     */
    @ApiModelProperty(value = "签名秘钥")
    private String signKey;
    /**
     * 联系人
     */
    @ApiModelProperty(value = "联系人")
    private String contactsName;
    /**
     * 联系人手机
     */
    @ApiModelProperty(value = "联系人手机")
    private String contactsPhone;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
    /**
     * 逻辑删除(1:已删除，0:未删除)
     */
    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    private Integer isDeleted;


}
