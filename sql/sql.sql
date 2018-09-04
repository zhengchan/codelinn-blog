CREATE TABLE t_user (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `name` VARCHAR(30) DEFAULT '',
  `sex` VARCHAR(2) DEFAULT '',
  `birthday` VARCHAR(8) DEFAULT '',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP NULL ,
`create_user` VARCHAR(32) NULL ,
`update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NULL ,
`update_user` VARCHAR(32) NULL ,
  PRIMARY KEY (`id`),
  KEY `idx_userid`(`user_id`)
) ENGINE=INNODB   DEFAULT CHARSET=utf8;