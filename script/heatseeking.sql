/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : heatseeking

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-05-06 00:35:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hs_authentication
-- ----------------------------
DROP TABLE IF EXISTS `hs_authentication`;
CREATE TABLE `hs_authentication` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `USER_PASSWORD` varchar(512) DEFAULT NULL,
  `USER_CODE` varchar(255) DEFAULT NULL,
  `USER_ACCOUNT` varchar(255) DEFAULT NULL,
  `USER_CREATE_TIME` datetime DEFAULT NULL,
  `USER_LAST_LOGIN_TIME` datetime DEFAULT NULL,
  `LAST_LOGIN_IP` varchar(512) DEFAULT NULL COMMENT '最后登录 ip ',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最后登录时间',
  `USER_EMAIL` varchar(255) DEFAULT NULL COMMENT '邮件：可用于找回密码',
  `USER_FEED_BACK` varchar(255) DEFAULT NULL COMMENT '找回密码的问题',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hs_authentication
-- ----------------------------
INSERT INTO `hs_authentication` VALUES ('24', '123', '123', null, '123', null, null, null, null, '123', '123');

-- ----------------------------
-- Table structure for hs_role
-- ----------------------------
DROP TABLE IF EXISTS `hs_role`;
CREATE TABLE `hs_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `ROLE` varchar(10) DEFAULT NULL,
  `ROLE_ID` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hs_role
-- ----------------------------

-- ----------------------------
-- Table structure for hs_token
-- ----------------------------
DROP TABLE IF EXISTS `hs_token`;
CREATE TABLE `hs_token` (
  `TOKEN` varchar(255) NOT NULL,
  `ACTIVE_TIME` datetime NOT NULL,
  `IS_EFFECTIVE` int(1) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  PRIMARY KEY (`TOKEN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hs_token
-- ----------------------------
INSERT INTO `hs_token` VALUES ('19490795-0c44-4b52-b26e-b2c91126ac09', '2017-04-18 11:17:29', '1', '0');
INSERT INTO `hs_token` VALUES ('2308f673-c401-4a16-b055-ef12b4535da0', '2017-04-18 11:23:57', '1', '0');
INSERT INTO `hs_token` VALUES ('31df4876-f5f9-4539-8348-a07f3147a08e', '2017-04-18 11:11:07', '1', '0');
INSERT INTO `hs_token` VALUES ('344f5720-23b3-4dbb-abd0-f9fca1c24e04', '2017-05-03 17:37:48', '1', '21');
INSERT INTO `hs_token` VALUES ('3503f86e-1c58-45e6-b602-7a1b0143a46e', '2017-05-05 15:55:40', '1', '24');
INSERT INTO `hs_token` VALUES ('464537a8-13c3-4f8a-95bd-2543df97a36c', '2017-05-04 17:22:01', '1', '23');
INSERT INTO `hs_token` VALUES ('4745c64e-1743-4414-b1ee-6d3a89bad966', '2017-04-14 16:55:38', '1', '22');
INSERT INTO `hs_token` VALUES ('4ccdee4b-cd08-468a-aadd-4b2460291cc3', '2017-05-04 17:47:41', '1', '24');
INSERT INTO `hs_token` VALUES ('4ec663b8-3a0b-4942-9d3b-95c19d6a418e', '2017-04-18 11:16:17', '1', '0');
INSERT INTO `hs_token` VALUES ('55b06e62-5d43-480e-804a-1faa3bc26b21', '2017-05-04 17:47:41', '1', '24');
INSERT INTO `hs_token` VALUES ('5aea7666-6f84-4a8d-874f-050659e9f99b', '2017-04-18 11:04:46', '1', '0');
INSERT INTO `hs_token` VALUES ('63e9202b-780a-433f-bd9a-53fda7d12429', '2017-05-02 16:10:31', '1', '7');
INSERT INTO `hs_token` VALUES ('690dea21-e4be-4916-8750-84290cc28310', '2017-05-02 16:10:55', '1', '11');
INSERT INTO `hs_token` VALUES ('71d786c0-5734-4462-9aed-cbade37f4847', '2017-05-02 16:10:55', '1', '10');
INSERT INTO `hs_token` VALUES ('759d9a49-c462-4ad0-9766-798c1040f318', '2017-05-02 16:12:15', '1', '17');
INSERT INTO `hs_token` VALUES ('7702ea90-ebb4-4758-b5e9-fee83c8b079c', '2017-05-02 16:10:56', '1', '14');
INSERT INTO `hs_token` VALUES ('7c3746ad-c8cb-4b15-af39-e2b01e76ea5c', '2017-05-02 16:12:59', '1', '18');
INSERT INTO `hs_token` VALUES ('89c24d9c-ab63-49d6-90ae-df84dcca75cd', '2017-05-02 16:10:40', '1', '8');
INSERT INTO `hs_token` VALUES ('9f0796bc-90c9-4984-931c-26f7663f8d48', '2017-04-14 17:05:01', '1', '24');
INSERT INTO `hs_token` VALUES ('a5c9cfd5-196a-47b0-ac50-4ee0d5d289ad', '2017-04-18 11:07:36', '1', '0');
INSERT INTO `hs_token` VALUES ('ad3b747d-f2e6-45d6-b731-3aaa9b9bfb50', '2017-05-03 16:33:13', '1', '20');
INSERT INTO `hs_token` VALUES ('b29b3e3a-3b5a-4bfd-ae5e-8de22b7dcb7f', '2017-05-03 11:00:52', '1', '19');
INSERT INTO `hs_token` VALUES ('c5065f23-c589-46ad-830c-98b0a3f4ea69', '2017-05-02 16:10:56', '1', '13');
INSERT INTO `hs_token` VALUES ('cc33cbd0-fa15-4ba0-a857-d14025dca344', '2017-05-05 09:29:32', '1', '24');
INSERT INTO `hs_token` VALUES ('cc98c385-72db-4191-91d1-e91fd9b6144b', '2017-05-02 16:11:33', '1', '16');
INSERT INTO `hs_token` VALUES ('e27b165b-8d3b-41c5-a2af-961504213a2c', '2017-05-02 16:10:55', '1', '9');
INSERT INTO `hs_token` VALUES ('e81df2ad-8341-43d9-b61d-15676b32c4b7', '2017-05-04 17:41:45', '1', '24');
INSERT INTO `hs_token` VALUES ('f638b802-eb30-4c01-9b82-080a27957e28', '2017-05-02 16:11:29', '1', '15');
INSERT INTO `hs_token` VALUES ('fa1e4f9d-571a-4012-9c17-4a18af542e8f', '2017-05-02 16:10:56', '1', '12');

-- ----------------------------
-- Table structure for ip_access_list
-- ----------------------------
DROP TABLE IF EXISTS `ip_access_list`;
CREATE TABLE `ip_access_list` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IP_ADDR` varchar(30) DEFAULT NULL,
  `HANDLE_STATUS` int(2) NOT NULL DEFAULT '0' COMMENT '状态',
  `IS_ACCESSABLE` int(2) DEFAULT NULL COMMENT '0: ENABLE 1:DISABLE',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_access_list
-- ----------------------------

-- ----------------------------
-- Table structure for redsword_access_history
-- ----------------------------
DROP TABLE IF EXISTS `redsword_access_history`;
CREATE TABLE `redsword_access_history` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IP_ADDRESS` varchar(30) DEFAULT NULL COMMENT 'ip地址',
  `SYS_METHOD_NAME` varchar(30) DEFAULT NULL COMMENT '访问系统中的方法',
  `ACCESS_DATE_TIME` datetime DEFAULT NULL COMMENT '访问时间',
  `IS_REFUSE` int(2) DEFAULT NULL COMMENT '是否被拒绝访问： 1：是 ，0：否',
  `ACCESS_PARAMS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of redsword_access_history
-- ----------------------------
INSERT INTO `redsword_access_history` VALUES ('1', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-03 16:28:31', '0', '[1, 10, auto, org.apache.catalina.connector.RequestFacade@6c433f8c]');
INSERT INTO `redsword_access_history` VALUES ('2', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-03 17:17:34', '0', '[1, 10, auto, org.apache.catalina.connector.RequestFacade@29dd8332]');
INSERT INTO `redsword_access_history` VALUES ('3', '0:0:0:0:0:0:0:1', 'register', '2017-05-03 17:17:48', '0', '[empty, cc.tinker.entity.AuthenticationEntity@a227cee, org.apache.catalina.connector.ResponseFacade@39dd9484, org.apache.catalina.connector.RequestFacade@5e1541a4]');
INSERT INTO `redsword_access_history` VALUES ('4', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-03 17:48:52', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('5', '0:0:0:0:0:0:0:1', 'register', '2017-05-03 17:49:23', '0', 'cc.tinker.controller.AuthController.register');
INSERT INTO `redsword_access_history` VALUES ('6', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-03 17:59:55', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('7', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 16:52:19', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('8', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 16:52:46', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('9', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 16:54:25', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('10', '0:0:0:0:0:0:0:1', 'register', '2017-05-04 16:55:29', '0', 'cc.tinker.controller.AuthController.register');
INSERT INTO `redsword_access_history` VALUES ('11', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 16:55:36', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('12', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 16:57:46', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('13', '0:0:0:0:0:0:0:1', 'register', '2017-05-04 16:58:23', '0', 'cc.tinker.controller.AuthController.register');
INSERT INTO `redsword_access_history` VALUES ('14', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:02:01', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('15', '0:0:0:0:0:0:0:1', 'register', '2017-05-04 17:02:01', '0', 'cc.tinker.controller.AuthController.register');
INSERT INTO `redsword_access_history` VALUES ('16', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:02:51', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('17', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:01', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('18', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:05', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('19', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:08', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('20', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:13', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('21', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:15', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('22', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:05:52', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('23', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:08:23', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('24', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:12:07', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('25', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:12:18', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('26', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:12:36', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('27', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:12:39', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('28', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:12:41', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('29', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:20:09', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('30', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:21:40', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('31', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:24:45', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('32', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-04 17:27:33', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('33', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-05 09:09:26', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('34', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-05 09:11:31', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');
INSERT INTO `redsword_access_history` VALUES ('35', '0:0:0:0:0:0:0:1', 'getSiteBootstrapTable', '2017-05-05 15:35:31', '0', 'cc.tinker.controller.PassWordMgrController.getSiteBootstrapTable');

-- ----------------------------
-- Table structure for redsword_rsa_key
-- ----------------------------
DROP TABLE IF EXISTS `redsword_rsa_key`;
CREATE TABLE `redsword_rsa_key` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RSA_PUBLIC_KEY` varchar(1024) DEFAULT NULL,
  `RSA_PRIVATE_KEY` varchar(2048) DEFAULT NULL,
  `IS_DELETED` int(2) DEFAULT NULL COMMENT '0:正常 1：删除',
  `KEY_HOLDER` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of redsword_rsa_key
-- ----------------------------

-- ----------------------------
-- Table structure for site_encode_password
-- ----------------------------
DROP TABLE IF EXISTS `site_encode_password`;
CREATE TABLE `site_encode_password` (
  `ID` int(8) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `SITE_CODE` varchar(255) NOT NULL,
  `SITE_ADDR` varchar(255) DEFAULT NULL,
  `SITE_PASSWORD_ENCODE` varchar(1024) NOT NULL,
  `SITE_NAME` varchar(255) DEFAULT NULL,
  `SITE_ENCODE_METHOD` int(3) NOT NULL,
  `LAST_DECODE_TIME` datetime NOT NULL,
  `LAST_DECODE_IP` varchar(20) NOT NULL,
  `DECODE_COUNT` int(8) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_encode_password
-- ----------------------------
