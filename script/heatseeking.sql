/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : heatseeking

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-04-16 23:18:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hs_authentication
-- ----------------------------
DROP TABLE IF EXISTS `hs_authentication`;
CREATE TABLE `hs_authentication` (
  `ID` int(11) NOT NULL,
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
  `USER_RSA_PRIVATE_KEY` varchar(2048) DEFAULT NULL COMMENT 'RSA PRIVATE KEY',
  `USER_RSA_PUBLIC_KEY` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hs_authentication
-- ----------------------------

-- ----------------------------
-- Table structure for hs_role
-- ----------------------------
DROP TABLE IF EXISTS `hs_role`;
CREATE TABLE `hs_role` (
  `ID` int(11) NOT NULL,
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

-- ----------------------------
-- Table structure for ip_access_list
-- ----------------------------
DROP TABLE IF EXISTS `ip_access_list`;
CREATE TABLE `ip_access_list` (
  `ID` int(11) NOT NULL,
  `IP_ADDR` varchar(30) DEFAULT NULL,
  `HANDLE_STATUS` int(2) NOT NULL DEFAULT '0' COMMENT '状态',
  `IS_ACCESSABLE` int(2) DEFAULT NULL COMMENT '0: ENABLE 1:DISABLE',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_access_list
-- ----------------------------

-- ----------------------------
-- Table structure for site_encode_password
-- ----------------------------
DROP TABLE IF EXISTS `site_encode_password`;
CREATE TABLE `site_encode_password` (
  `ID` int(8) NOT NULL,
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
