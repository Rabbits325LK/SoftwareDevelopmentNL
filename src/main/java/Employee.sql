--create table
create table sdnl_employee(
empId int NOT NULL AUTO_INCREMENT key primary,
empName varchar(30),
empPwd varchar(30),
address varchar(120),
phone varchar(11),
age int(3),
sex int(1),
createTime timestamp default current_timestamp,
birth date,
empLevel int default 0,
departmentNum int default 0,  
empEmail varchar(120),
empQQ varchar(60),
empSaraly double;