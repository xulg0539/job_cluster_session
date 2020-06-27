CREATE TABLE `tb_resume` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

INSERT INTO `tb_resume` (`id`, `address`, `name`, `phone`) VALUES (29, '测试地址1', '张三', '15801201697');
INSERT INTO `tb_resume` (`id`, `address`, `name`, `phone`) VALUES (30, '测试地址2', '李四', '15801201611');
INSERT INTO `tb_resume` (`id`, `address`, `name`, `phone`) VALUES (32, '测试地址4', '徐六', '158012016999');
INSERT INTO `tb_resume` (`id`, `address`, `name`, `phone`) VALUES (33, '测试7', '测试7', '测试7');
INSERT INTO `tb_resume` (`id`, `address`, `name`, `phone`) VALUES (34, '测试8', '测试8', '测试8');
