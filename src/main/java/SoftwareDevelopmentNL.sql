--create table sdnl_employee
create table sdnl_employee(
empId int NOT NULL AUTO_INCREMENT primary key,
empName varchar(30) not null,
empPwd varchar(30) not null,
address varchar(120),
phone varchar(11),
age int(3) not null,
sex int(1) not null,
createTime timestamp default current_timestamp,
birth date,
empLevel int default 0,
departmentNum int default 0,  
empEmail varchar(120),
empQQ varchar(60),
empSaraly double);

--create table sdnl_empLevel
create table sdnl_empLevel (
empLevelId int NOT NULL AUTO_INCREMENT primary key,
empLevel int,
empLeveName varchar(120));

--create table sdnl_departmentNum
create table sdnl_departmentNum (
departmentNumId int NOT NULL AUTO_INCREMENT primary key,
departmentNum int,
departmentNumName varchar(120));

--create table sdnl_attendance
create table sdnl_attendance (
attendanceId int NOT NULL AUTO_INCREMENT primary key,
empId int,
empName varchar(30),
departmentNum int,
empLevel int,
startTime date,
stopTime date,
overTime int,
lateTime int,
leaveOneDay int,
leaveOneHalfDay int,
createTime timestamp default current_timestamp);

--create table sdnl_message
create table sdnl_message (
messageId int NOT NULL AUTO_INCREMENT primary key,
messageTitle varchar(120),
messageContext  MEDIUMTEXT,
messagePublisher varchar(60),
messageTime timestamp default current_timestamp,
empLevel int);

--create table sdnl_reply
create table sdnl_reply (
replyId int NOT NULL AUTO_INCREMENT primary key,
replyContext  MEDIUMTEXT,
replyAdmin varchar(60),
replyTime timestamp default current_timestamp,
messageId int);

--create table sdnl_criticism
create table sdnl_criticism(
criticismId int not null auto_increment primary key,
criticismContext MEDIUMTEXT,
criticismAdmin varchar(60),
criticismTime timestamp default current_timestamp,
messageId int);

--insert into sdnl_departmentNum
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(0,'待设定');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(1,'董事局');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(2,'总经办');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(3,'开发部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(4,'销售部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(5,'运营部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(6,'推广部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(7,'财务部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(8,'行政部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(9,'售后部');
insert into sdnl_departmentNum(departmentNum,departmentNumName) values(99,'系统管理中心');


--insert into sdnl_empLevel
insert into sdnl_empLevel(emplevel,empLevelName) values(0,'未设定');
insert into sdnl_empLevel(emplevel,empLevelName) values(1,'董事长');
insert into sdnl_empLevel(emplevel,empLevelName) values(2,'副懂事长');
insert into sdnl_empLevel(emplevel,empLevelName) values(3,'总经理');
insert into sdnl_empLevel(emplevel,empLevelName) values(4,'副总经理');
insert into sdnl_empLevel(emplevel,empLevelName) values(5,'总监');
insert into sdnl_empLevel(emplevel,empLevelName) values(6,'副总监');
insert into sdnl_empLevel(emplevel,empLevelName) values(7,'主管');
insert into sdnl_empLevel(emplevel,empLevelName) values(8,'助理');
insert into sdnl_empLevel(emplevel,empLevelName) values(9,'职员');
insert into sdnl_empLevel(emplevel,empLevelName) values(10,'试用职员');
insert into sdnl_empLevel(emplevel,empLevelName) values(99,'系统管理员');