# HotelManagement
DROP TABLE IF EXISTS `bill`;
CREATE DATABASE `HotelManagement`;

CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userCode` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户编码',
  `userName` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
  `userPassword` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
  `gender` INT(10) DEFAULT NULL COMMENT '性别（1:女、 2:男）',
  `birthday` DATE DEFAULT NULL COMMENT '出生日期',
  `phone` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机',
  `userRole` BIGINT(20) DEFAULT NULL COMMENT '用户角色（取自角色表-角色id）',
  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
  `modifyDate` DATETIME DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX (`userRole`),
  FOREIGN KEY (`userRole`) REFERENCES `role`(`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci


INSERT  INTO `user`(`id`,`userCode`,`userName`,`userPassword`,`gender`,`birthday`,`phone`,`userRole`,`creationDate`,`modifyDate`) VALUES 
(1,'admin','系统管理员','1234567',2,'1983-10-10','13688889999',1,'2013-03-21 16:52:07',NULL),
(2,'xiaoming','小明','0000000',2,'1999-12-10','13688884457',2,'2019-12-31 19:52:09',NULL),
(3,'xiaocheng','小程','0000000',2,'1999-06-05','18567542321',2,'2019-12-31 19:52:09',NULL),
(4,'xiaoyang','小扬','0000000',2,'1999-06-06','18567552321',2,'2019-12-31 19:52:09',NULL),
(5,'xiaoqian','小仟','0000000',2,'1999-02-08','18567552321',3,'2019-12-31 19:52:09',NULL);


CREATE TABLE `bill` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `billCode` VARCHAR(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '账单编码',
  `orderId` BIGINT(20) DEFAULT NULL COMMENT '下单用户ID',
  `hotelId` BIGINT(20) DEFAULT NULL COMMENT '用户所订购酒店ID',
  `roomType` BIGINT(20) DEFAULT NULL COMMENT '房间类型',
  `checkInDate` DATE DEFAULT NULL COMMENT '入住时间',
  `checkOutDate` DATE DEFAULT NULL COMMENT '退房时间',
  `isCheckIn` INT(10) DEFAULT NULL COMMENT '是否入住（1：未入住 2：已入住）',
  `countDays` BIGINT(20) DEFAULT NULL COMMENT '入住天数',
  `totalPrice` DECIMAL(20,2) DEFAULT NULL COMMENT '总额',
  `isPayment` INT(10) DEFAULT NULL COMMENT '是否支付（1：未支付 2：已支付）',
  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
  `modifyDate` DATETIME DEFAULT NULL COMMENT '更新时间',
  `providerId` BIGINT(20) DEFAULT NULL COMMENT '供应商ID',
  PRIMARY KEY (`id`),
  INDEX (`orderId`),
  FOREIGN KEY (`orderId`) REFERENCES `user`(`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci

INSERT  INTO `bill`(`id`,`billCode`,`orderId`,`hotelId`,`roomType`,`checkInDate`,`checkOutDate`,`isCheckIn`,`countDays`,`totalPrice`,`isPayment`,`creationDate`,`modifyDate`,`providerId`) 
VALUES 
(1,'BILL2020_001',2,1,1,'2020-06-01','2020-06-02',1,1,'25000.00',2,'2020-05-21 13:02:03',NULL,5),
(2,'BILL2016_002',3,1,1,'2020-06-01','2020-06-02',1,1,'25000.00',2,'2020-05-21 13:02:03',NULL,5),
(3,'BILL2016_003',4,1,1,'2020-06-01','2020-06-02',1,1,'25000.00',2,'2020-05-21 13:02:03',NULL,5);

CREATE TABLE `hotel` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `hotelName` VARCHAR(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '酒店名称',
  `hotelAddress` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '酒店地址明细',
  `postCode` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '邮编',
  `tel` VARCHAR(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系人电话',
  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
  `userId` BIGINT(20) DEFAULT NULL COMMENT '老板ID',
  INDEX (`userId`),
  FOREIGN KEY (`userId`) REFERENCES `user`(`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT  INTO `hotel` (`id`,`hotelName`,`hotelAddress`,`postCode`,`tel`,`creationDate`,`userId`)
VALUES(1,'金陵饭店','南京汉中路2号','210000','15366024589','2020-06-07',5),
(2,'南京金鹰国际酒店','南京汉中路101号','210000','15399024589','2020-06-07',5);


CREATE TABLE `hotelType` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `hotelId` BIGINT(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '酒店ID',
  `hoteRoomType` VARCHAR(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '酒店房间类型',
  `hotelRomeNumber` BIGINT(20) DEFAULT NULL COMMENT '房间总数量',
  `hotelPrice` DECIMAL(20,2) DEFAULT NULL COMMENT '单价',
  `hotelPeople` BIGINT(20) DEFAULT NULL COMMENT '可入住人数',
  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
  `modifyDate` DATETIME DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX (`hotelId`),
  FOREIGN KEY (`hotelId`) REFERENCES `hotel`(`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci

INSERT INTO `hotelType`(`id`,`hotelId`,`hoteRoomType`,`hotelRomeNumber`,`hotelPrice`,`hotelPeople`,`creationDate`,`modifyDate`)
VALUES(1,1,'标准间',10,'800.00',5,'2020-06-07',NULL),
(2,1,'豪华大床房',5,'1600.00',5,'2020-06-07',NULL),
(3,2,'标准间',10,'800.00',5,'2020-06-07',NULL),
(4,2,'豪华大床房',5,'1600.00',5,'2020-06-07',NULL);

CREATE TABLE `role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `roleName` VARCHAR(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名称',
  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
  `modifyBy` BIGINT(20) DEFAULT NULL COMMENT '修改者',
  `modifyDate` DATETIME DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT  INTO `role`(`id`,`roleName`,`creationDate`,`modifyBy`,`modifyDate`)
 VALUES (1,'系统管理员','2016-04-13 00:00:00',NULL,NULL),
 (2,'普通用户','2016-04-13 00:00:00',NULL,NULL),
 (3,'酒店管理员','2016-04-13 00:00:00',NULL,NULL);


