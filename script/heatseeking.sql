/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : heatseeking

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-04-10 10:45:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hs_authentication
-- ----------------------------
DROP TABLE IF EXISTS `hs_authentication`;
CREATE TABLE `hs_authentication` (
  `ID` int(8) NOT NULL,
  `PARASE` int(2) DEFAULT NULL COMMENT '是否验证 1 ：y ',
  `CLIENT_NAME` varchar(32) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `TOKEN` varchar(255) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `EmailVerify` varchar(6) DEFAULT NULL COMMENT 'email 验证',
  `REGISTE_TIME` datetime DEFAULT NULL,
  `LAST_LONGIN_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Table structure for hs_token
-- ----------------------------
DROP TABLE IF EXISTS `hs_token`;
CREATE TABLE `hs_token` (
  `TOKEN` varchar(255) NOT NULL,
  `ACTIVE_TIME` datetime DEFAULT NULL,
  `IS_EFFECTIVE` int(1) DEFAULT NULL,
  PRIMARY KEY (`TOKEN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
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
  `USER_RSA_PRIVATE_KEY` varchar(1024) DEFAULT NULL COMMENT 'RSA PRIVATE KEY',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
