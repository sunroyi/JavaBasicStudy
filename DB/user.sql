/*
Navicat MySQL Data Transfer

Source Server         : Sun
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : suntest

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-10-15 15:41:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Sun', '36');
INSERT INTO `user` VALUES ('2', 'Sunny', '20');
INSERT INTO `user` VALUES ('3', 'Royi', '36');
