/*
 Navicat Premium Data Transfer

 Source Server         : bzfx
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost
 Source Database       : bzfx

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : utf-8

 Date: 01/07/2021 16:21:05 PM
*/
grant all privileges on *.* to 'root'@'%' ;

DROP Database IF EXISTS `bzfx`;

CREATE Database `bzfx` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use `bzfx`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(2) NOT NULL,
  `c_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `m_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'root', '2bcbb821eac1c602329fa18ab360ba933b98cb9067b72a72fda2184cb95d968d', '1', '2021-11-10 17:45:39', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
