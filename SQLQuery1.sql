Create database SavetheFuture;
--use SavetheFuture;


CREATE TABLE Student
(
StudentId  BIGINT PRIMARY KEY,
FirstName varchar(50) NOT NULL,
LastName varchar(50) NOT NULL,
Email varchar(50) NOT NULL,
password varchar(50) NOT NULL,
Semester Numeric(5,1) NOT NULL,
PhoneNo varchar(50) NOT NULL,
);



 
  -- select * from student where StudentId=20200104113 and password=1234;
	
	
CREATE TABLE Teacher
(
TeacherId  BIGINT PRIMARY KEY,
Teacher_FirstName varchar(50) NOT NULL,
Teacher_LastName varchar(50) NOT NULL,
Teacher_Designation varchar(50) NOT NULL,
Teacher_Email varchar(50) NOT NULL,
password varchar(50) NOT NULL,
Teacher_PhoneNo varchar(50) NOT NULL,
);
select * from Teacher

CREATE TABLE Semester
(
Semester_no float NOT NULL,
Course_title varchar(50) NOT NULL,
Course_no varchar(50) NOT NULL,
TeacherId BIGINT FOREIGN KEY REFERENCES Teacher(TeacherId),
);

ALTER TABLE semester
ALTER COLUMN Semester_no nvarchar(50);

ALTER TABLE Semester
ADD Department varchar(50);
select * from Semester

CREATE TABLE student2 (
    Name VARCHAR(50),
    ID INT PRIMARY KEY,
    Email VARCHAR(100),
    Mobile VARCHAR(20)
);

select * from student2
/*
CREATE TABLE Result(
StudentId BIGINT NOT NULL,
Course varchar(20) NOT NULL,
Semester varchar(20) NOT NULL,
Quiz01 int NOT NULL,
Quiz02 int NOT NULL,
Quiz03 int NOT NULL,
Quiz04 int NOT NULL,
Attendance varchar(20) NOT NULL,
Average varchar(20) NOT NULL,
Final varchar(20) NOT NULL
);*/
Select * from RESULT 
ALTER TABLE Result
ALTER COLUMN Final nvarchar(50);
 Insert into Result(Course,Semester,Quiz01,Quiz02,Quiz03,Quiz04,Attendance,Average,Final) 
 Values ('CSE3101','3.1','10','5','8','9','10','15','55');

 SELECT AVG(Quiz01 + Quiz02 + Quiz03 + Quiz04)/3 AS avg_result FROM RESULT;
 truncate table student2;

alter table Result
 drop column  average;

 drop table result;


 CREATE TABLE ResultInfo(
StudentId BIGINT NOT NULL,
Course varchar(20) NOT NULL,
Semester varchar(20) NOT NULL,

);

CREATE TABLE Marks(
ID int not null,
Quiz01 int NOT NULL,
Quiz02 int NOT NULL,
Quiz03 int NOT NULL,
Quiz04 int NOT NULL,
Attendance varchar(20) NOT NULL,

Final varchar(20) NOT NULL
);
drop table marks;