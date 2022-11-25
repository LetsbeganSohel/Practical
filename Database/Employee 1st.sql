use soheldb;
create table Employee1( EmpID numeric(10), LastName varchar(20), JobId varchar(20),Sal integer(6),
CommonPersentage integer(5),MGR_Id integer(5), Dept_id numeric(5));
insert into Employee1 value
(11, 'Sen','2263','15000', '5.5',767,111);
truncate  table Employee1;
insert into Employee1 values 
(12,'Das','2263', '16000','6.5',767,111);
insert into Employee1 values
(13,'Mitra','2263','16500',5.6,767,111);
insert into Employee1 values
(14,'Halder','2263','26575',6.5,767,111);
insert into Employee1 values
(15,'Choudhury','2263','22567',5.9,767,111);
insert into Employee1 values
(16,'Ray','2263','27800',6.2,767,111);
select EmpID,LastName,JobID from soheldb.employee1;
select * from soheldb.employee1 where Dept_id='111';
#disttinct  - do not show deplicate one ;
select distinct JobId from soheldb.employee1;
#as
select lastName, sal ,sal+500 as 'increse Salary'from soheldb.employee1;
select lastName, sal ,sal+ CommonPersentage*100  as 'AnnualSalary'from soheldb.employee1;
#     ><
select lastName, EmpId, Dept_id from soheldb.employee1 where sal<20000;
select lastName, EmpId, Dept_id from soheldb.employee1 where sal>20000;
select *from soheldb.employee1 where  sal=16000 or sal=20500; 
update soheldb.employee1 set JobId='Gread-A'where sal>=20000;
select *from soheldb.employee1 where sal>=22000;
