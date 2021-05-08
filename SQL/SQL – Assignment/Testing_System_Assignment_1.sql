DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_1;
USE Testing_System_Assignment_1;
CREATE TABLE Department(
    DepartmentID INT AUTO_INCREMENT PRIMARY KEY,
    RepartmentName VARCHAR(50)
    
);
CREATE TABLE `Position` (
    PositionID INT AUTO_INCREMENT PRIMARY KEY,
    PositionName ENUM ('Dev', 'Test', 'Scrum Master',' PM')
);
CREATE TABLE `Account`(
AccountID INT AUTO_INCREMENT PRIMARY KEY,
Email VARCHAR(50),
Username VARCHAR(50),
FullName VARCHAR(50),
DepartmentID INT,
PositionID INT,
CreateDate DATE,
FOREIGN KEY (DepartmentID)  REFERENCES  Department(DepartmentID),
FOREIGN KEY (PositionID )   REFERENCES `Position`(PositionID )
);
CREATE TABLE  `Group`(
  GroupID INT AUTO_INCREMENT PRIMARY KEY,
  GroupName VARCHAR(50),
  CreatorID  INT,
  CreatorDate DATE
);
CREATE TABLE GroupAccount (
   GroupID INT,
   AccountID INT,
   JoinDate DATE,
   FOREIGN KEY (GroupID)  REFERENCES `Group`(GroupID),
    FOREIGN KEY (AccountID)  REFERENCES `Account`(AccountID)
);
CREATE TABLE TypeQuestion (
TypeID INT AUTO_INCREMENT PRIMARY KEY,
TypeName ENUM('Essay', 'Multiple-Choice')
);
CREATE TABLE CategoryQuestion (
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(50)
);
CREATE TABLE Question (
 QuestionID INT AUTO_INCREMENT PRIMARY KEY,
 Content VARCHAR(50),
 CategoryID INT,
 TypeID INT,
 CreatorID INT,
 CreateDate DATE,
  FOREIGN KEY (TypeID)  REFERENCES TypeQuestion(TypeID),
  FOREIGN KEY (CategoryID)  REFERENCES CategoryQuestion(CategoryID)
);
CREATE TABLE  Answer (
AnswerID INT AUTO_INCREMENT PRIMARY KEY,
 Content VARCHAR(50),
 QuestionID INT,
 isCorrect BOOLEAN,
  FOREIGN KEY (QuestionID)  REFERENCES Question(QuestionID)
);
CREATE TABLE Exam (
  ExamID INT AUTO_INCREMENT PRIMARY KEY,
  code_ INT ,
  Title VARCHAR(50),
  CategoryID INT, 
  Duration DATE,
  CreatorID INT ,
  CreateDate DATE,
FOREIGN KEY (CategoryID)  REFERENCES CategoryQuestion(CategoryID)
);
CREATE TABLE ExamQuestion(
    ExamID INT,
    QuestionID INT,
     FOREIGN KEY (ExamID)  REFERENCES Exam(ExamID),
	FOREIGN KEY (QuestionID)  REFERENCES Question(QuestionID)
);