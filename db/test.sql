/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-07-20 14:20:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `my_test`
-- ----------------------------
DROP TABLE IF EXISTS `my_test`;
CREATE TABLE `my_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `test` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_test
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(36) NOT NULL COMMENT '用户id',
  `username` varchar(45) DEFAULT NULL COMMENT '用户名',
  `password` varchar(36) DEFAULT NULL COMMENT '密码',
  `age` int(11) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456', '22');
INSERT INTO `user` VALUES ('2', 'test', '123456', '22');
INSERT INTO `user` VALUES ('d9bbac39-aa27-11e9-98c2-9828a605d4a2', '333', '333', '33');
INSERT INTO `user` VALUES ('f7bf2ffa-b27f-11e8-9b7d-00ffbcd4c063', 'QWE', 'qwe', '18');
