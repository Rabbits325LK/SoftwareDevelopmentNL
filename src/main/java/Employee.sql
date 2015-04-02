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
startTime timestamp,
stopTime timestamp,
overTime int,
lateTime int,
leaveOneDay int,
leaveOneHalfDay int);

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