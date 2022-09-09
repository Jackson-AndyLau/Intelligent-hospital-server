/*
 Navicat Premium Data Transfer

 Source Server         : mysql_129
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : 192.168.190.129:3306
 Source Schema         : bwh_hospital

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 08/09/2022 17:36:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for h_hospital_set
-- ----------------------------
DROP TABLE IF EXISTS `h_hospital_set`;
CREATE TABLE `h_hospital_set`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `hosname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医院名称',
  `hoscode` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医院编号',
  `api_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'api基础路径',
  `sign_key` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '签名秘钥',
  `contacts_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人',
  `contacts_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人手机',
  `status` tinyint(0) NOT NULL DEFAULT 0 COMMENT '状态',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `is_deleted` tinyint(0) NOT NULL DEFAULT 0 COMMENT '逻辑删除(1:已删除，0:未删除)',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_hoscode`(`hoscode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院设置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of h_hospital_set
-- ----------------------------
INSERT INTO `h_hospital_set` VALUES ('1', '合江亭', '1001', NULL, NULL, NULL, NULL, 0, '2022-09-04 04:34:24', '2022-09-04 04:34:24', 1);
INSERT INTO `h_hospital_set` VALUES ('b2603f84041ff2e5e82290d662bff160', '长江综合医院', '200001', 'https://www.baidu.com/', '998279', '华仔', '15827618992', 0, '2022-09-04 04:28:22', '2022-09-04 04:28:22', 0);

SET FOREIGN_KEY_CHECKS = 1;
