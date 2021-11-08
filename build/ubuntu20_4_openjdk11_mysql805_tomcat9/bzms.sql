/*
 Navicat Premium Data Transfer

 Source Server         : zhiwei
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost
 Source Database       : bzms

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : utf-8

 Date: 12/18/2020 13:49:42 PM
*/
DROP DATABASE IF EXISTS `bzms`;
CREATE DATABASE `bzms`;
use bzms;

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
INSERT INTO `user` VALUES ('1', 'root', 'ee281aaea3634772e6139e2bb58bcd28161f4c990dc7059e565a0d2e9fd636bb', '1', '2020-11-10 17:45:39', null), ('2', 'guest@bzms', 'da12c8bb333d59c85bb20b4accd29278b0a47e0d9d165105930b24e9e2da6e64', '2', '2020-11-11 10:12:32', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
