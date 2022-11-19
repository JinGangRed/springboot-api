CREATE SCHEMA `start-lover` DEFAULT CHARACTER SET utf8mb4 ;

USE `start-lover` ;
drop table if exists user;
CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户编号',
                        `account` varchar(45)  NOT NULL COMMENT '账户',
                        `userName` varchar(45)  DEFAULT '' COMMENT '用户名称',
                        `nickName` varchar(45)  DEFAULT '' COMMENT '昵称',
                        `userType` varchar(2) DEFAULT '00' COMMENT '用户类型(00 系统用户 01 注册用户)',
                        `email` varchar(50)  DEFAULT '' COMMENT '用户邮箱',
                        `phone` varchar(11)  DEFAULT '' COMMENT '手机号码',
                        `gender` char(1) DEFAULT '2' COMMENT '性别: 0 男; 1 女; 2 未知',
                        `avatar` varchar(200) DEFAULT '' COMMENT '用户头像',
                        `password` varchar(45)  NOT NULL COMMENT '密码',
                        `salt` varchar(20) DEFAULT '' COMMENT '加密盐',
                        `status` char(1)  NOT NULL DEFAULT '1' COMMENT '账号状态: 0停用, 1 正常',
                        `delFlag` char(1)  NOT NULL DEFAULT '0' COMMENT '删除标记: 0 正常; 1 删除',
                        `createdBy` varchar(45)  NOT NULL DEFAULT '' COMMENT '创建人',
                        `createdTime` datetime NOT NULL COMMENT '创建时间',
                        `updatedBy` varchar(45)  DEFAULT '' COMMENT '更新人',
                        `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
                        `remark` varchar(500)  DEFAULT NULL COMMENT '备注',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `account_UNIQUE` (`account`)
) ENGINE=InnoDB COMMENT='用户信息表';

drop table if exists `role`;
CREATE TABLE `role` (
                        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '角色ID',
                        `roleName` varchar(45) NOT NULL COMMENT '角色名称',
                        `roleKey` varchar(45) NOT NULL COMMENT '角色权限字符串',
                        `roleOrder` int NOT NULL COMMENT '显示顺序',
                        `status` char(1) NOT NULL DEFAULT '1' COMMENT '状态: 0停用, 1 正常',
                        `delFlag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记: 0 正常; 1 删除',
                        `createdBy` varchar(45)  NOT NULL DEFAULT '' COMMENT '创建人',
                        `createdTime` datetime NOT NULL COMMENT '创建时间',
                        `updatedBy` varchar(45)  DEFAULT '' COMMENT '更新人',
                        `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
                        `remark` varchar(500) DEFAULT NULL COMMENT '备注',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='角色信息表';

drop table if exists menu;
CREATE TABLE `menu` (
                        `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
                        `menuName` VARCHAR(50) NOT NULL COMMENT '菜单名称',
                        `parentId` BIGINT NOT NULL DEFAULT 0 COMMENT '父菜单ID',
                        `orderNum` INT NOT NULL DEFAULT 0 COMMENT '显示顺序',
                        `url` VARCHAR(200) NULL DEFAULT '#' COMMENT '请求地址',
                        `target` VARCHAR(20) NULL DEFAULT '' COMMENT '打开方式（menuItem页签 menuBlank新窗口）',
                        `menuType` CHAR(1) NULL DEFAULT '' COMMENT '菜单类型菜单类型（M目录 C菜单 B按钮）',
                        visible CHAR(1) NULL DEFAULT '1' COMMENT '菜单状态（1显示 0隐藏）',
                        `menuKey` VARCHAR(100) NULL DEFAULT '' COMMENT '菜单标识',
                        `icon` VARCHAR(100) NULL DEFAULT '' COMMENT '菜单图标',
                        `createdBy` varchar(45)  NOT NULL DEFAULT '' COMMENT '创建人',
                        `createdTime` datetime NOT NULL COMMENT '创建时间',
                        `updatedBy` varchar(45)  DEFAULT '' COMMENT '更新人',
                        `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
                        `remark` varchar(500) DEFAULT NULL COMMENT '备注',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT = '菜单权限表';

drop table if exists user_role;
CREATE TABLE `user_role` (
                             `userId` BIGINT NOT NULL COMMENT '用户ID',
                             `roleId` VARCHAR(45) NOT NULL COMMENT '角色ID',
                             PRIMARY KEY (`userId`, `roleId`)
)ENGINE=InnoDB COMMENT = '用户和角色关系表';

drop table if exists role_menu;
CREATE TABLE `role_menu` (
                             `roleId` VARCHAR(45) NOT NULL COMMENT '角色ID',
                             `menuId` BIGINT NOT NULL COMMENT '菜单ID',
                             PRIMARY KEY ( `roleId`,`menuId`)
)ENGINE=InnoDB COMMENT = '角色和菜单关系表';

drop table if exists operation_log;
CREATE TABLE `operation_log` (
                                 `id` BIGINT NOT NULL COMMENT '日志ID',
                                 `module` VARCHAR(45) NULL DEFAULT '' COMMENT '模块',
                                 `businessType` char(1) NULL DEFAULT 0 COMMENT '业务类型（0其它 1新增 2修改 3删除）',
                                 `method` VARCHAR(100) NULL DEFAULT '' COMMENT '请求方法',
                                 `requestMethod` VARCHAR(10) NULL DEFAULT '' COMMENT '请求方式',
                                 `operatorType` CHAR(1) NULL DEFAULT 0 COMMENT '操作员类别（0其它 1后台用户 2手机端用户）',
                                 `operator` VARCHAR(45) NULL DEFAULT '' COMMENT '操作人员',
                                 `requestUrl` VARCHAR(512) NULL DEFAULT '' COMMENT '请求URL',
                                 `requestIp` VARCHAR(512) NULL DEFAULT '' COMMENT '请求地址',
                                 `requestLocation` VARCHAR(512) NULL DEFAULT '' COMMENT '操作地址信息',
                                 `requestParameter` VARCHAR(2000) NULL DEFAULT '' COMMENT '请求参数',
                                 `result` VARCHAR(2000) NULL DEFAULT '' COMMENT '请求结果',
                                 `status` CHAR(1) NULL DEFAULT '1' COMMENT '请求结果状态:1 正常，0异常',
                                 `operateTime` DATETIME NULL COMMENT '操作时间',
                                 `errorMsg` VARCHAR(2000) NULL COMMENT '错误信息',
                                 PRIMARY KEY (`id`)
)ENGINE=InnoDB COMMENT = '操作日志表';





