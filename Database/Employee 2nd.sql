use soheldb;
create table Employee3(EmpID int primary key , Ename varchar(25) not null,Desingtion varchar(20) not null,
Dept varchar(10) not null, Working_hour int);
alter table Employee3 add Salary varchar(20) after Working_hour;
alter table Employee3 change Dept  Depertment varchar (25);
insert into Employee3 value
(1,'Anirban','Assistant','java','7','23000');
insert into Employee3 value
(2,'Arafat','Juniour','C++','7','23000');
insert into Employee3 value
(3,'Amir','Assistant','Python','7','25000');
insert into Employee3 value
(4,'Santonu','Assistant','Php','7','27000');
insert into Employee3 value
(5,'Sanjay','Assistant','Wordpress','7','17000');
insert into Employee3 value
(6,'Tapan','Managar','Mysql','7','30000');
insert into Employee3 value
(7,'Ratan','Operator','Ceo','7','103000');