create database pro_server CHARACTER SET utf8 COLLATE utf8_general_ci;
use pro_server;
show tables;

/**用户表*/
select * from Users;

drop table Users;

create table Users(
ID int AUTO_INCREMENT primary key,
Name varchar(40),
Password varchar(12),
Email varchar(21),
Phone varchar(11)
);
alter TABLE Users AUTO_INCREMENT=100000;
/**角色表*/
drop table role;
create table  role(
id int AUTO_INCREMENT primary key,
rolename varchar(20) not null,
massage varchar(200) not null
);
alter TABLE role AUTO_INCREMENT=100000;
select * from role;
/**权限表*/
drop table permission;
create table permission(
id int  AUTO_INCREMENT primary key,
per_name varchar(200) not null,
per_url varchar(200) not null,
per_massage varchar(150) not null
);
alter TABLE permission AUTO_INCREMENT=100000;
insert into permission values('10000','新闻管理','/newsM','对新闻的删除');
insert into permission values('10001','用户管理','/userM','对用户的增删改查');
insert into permission values('10002','角色管理','/roleM','对角色的的增删改查');
/**建用户角色表  */
drop table user_role;
create table user_role(
    id int AUTO_INCREMENT primary key,
    user_id int not null references Users(ID),
    role_id int not null
);
alter TABLE user_role AUTO_INCREMENT=100000;
 /**创建角色权限表*/
 drop table role_permission;
   create table role_permission(
   id int  AUTO_INCREMENT primary key,
   role_id  INT not null,
   permission_id INT not null
);
alter TABLE role_permission AUTO_INCREMENT=100000;
/**业主信息*/
drop table Owners;
 create table Owners(
 ownerID int AUTO_INCREMENT primary key,
 ownerName varchar(50),
 ownerTel Varchar(11),
 ownerInfo varchar(100),
 ownerDel varchar(10),
 owmerCart varchar(30),
 update_Tm varchar(19)
 );
 /**保修*/
 drop table repairS;
 create table  repairS(
 repariIDrepariID INT AUTO_INCREMENT Primary key,
 repairTime varchar(35),
 repairInfo varchar(200),
 ownerID int,
 repairDel varchar(20),
 repairIdentify varchar(25),
  update_Tm varchar(19)
 );
 /**缴费*/
 drop table charge;
 create table charge(
 chargeId int AUTO_INCREMENT primary key,
 chargeTime varchar(25),
 chargeName varchar(23),
 chargeMoney varchar(12),
 ownerID int ,
 chargeDel varchar(10),
 update_Tm varchar(19)
 )









