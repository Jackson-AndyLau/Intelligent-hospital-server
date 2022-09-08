package com.huazai.bwh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * Company:     智慧医通一体化管理平台
 * Department:  研发一组
 * Title:       [bwh_service_hospital 模块]
 * Description: [BwhServiceHospitalApplication 启动类]
 * Created on:  2021-07-2
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@SpringBootApplication(scanBasePackages = "com.huazai")
public class BwhServiceHospitalApplication {

    public static void main(String[] args) {

        SpringApplication.run(BwhServiceHospitalApplication.class, args);
    }

}
