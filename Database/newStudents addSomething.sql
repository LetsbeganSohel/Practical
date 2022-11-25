SELECT * FROM newdb.student_details where saddr='kolkata';
#add
SELECT * FROM newdb.student_details where saddr='kolkata' and squalification='BE';
#or
SELECT * FROM newdb.student_details where saddr ='delhi' or squalification='B Tech' ;
#not
SELECT * FROM newdb.student_details where saddr!='kolkata';
#in
SELECT * FROM newdb.student_details where saddr in ('kolkata', 'chennai');
#in
SELECT * FROM newdb.student_details where squalification in ('BE', 'B Tech');
#start with
SELECT * FROM newdb.student_details where sname like 'A%';
# ends with
SELECT * FROM newdb.student_details where sname like '%A';
# sname  contains with a 
SELECT * FROM newdb.student_details where sname like '%A%';
#missing letter
SELECT * FROM newdb.student_details where saddr like 'che__ai';
SELECT * FROM newdb.student_details where squalification like 'B_ ';




