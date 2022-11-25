use soheldb;
create table emp1(Id numeric(3), e_Name varchar(10), basic numeric(6,2),Designation varchar(10),
age int(10));
alter table  emp1 modify basic  integer(6);
alter table emp1 modify Id int primary key auto_increment;
create table employeeTable (E_Id numeric, E_Name  varchar(10), E_basic numeric(6,2),E_Designation varchar(10),
E_age int(10));
insert into emp1 values 
(1,'Rony',23400,'Ceo',29);
insert into emp1 values 
(2,'Tony',2330,'Manager',30);
insert into emp1 values 
(3,'Symal',12000,'assintant',23);
insert into emp1 values 
(4,'Pony',22300,'r manager',29);
insert into emp1 values 
(5,'Anmol',25400,'c-manager',29);
insert into employeeTable select *from emp1; 
select * from emp1,employeeTable ;
alter table emp1 add skill varchar(20) after basic;
update emp1 set  skill='c' where id=1;
update emp1 set  skill='java' where id=2;
update emp1 set  skill='c++' where id=3;
update emp1 set  skill='Angular' where id=4;
update emp1 set  skill='html' where id=5;