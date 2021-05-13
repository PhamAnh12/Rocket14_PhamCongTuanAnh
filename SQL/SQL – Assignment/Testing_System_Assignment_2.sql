-- create database
DROP DATABASE IF EXISTS Testing_System_Assignment_2;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_2;
USE Testing_System_Assignment_2;
-- create table 1: Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	DepartmentID 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName 			VARCHAR(255) NOT NULL UNIQUE KEY
);

-- create table 2: Posittion
DROP TABLE IF EXISTS Position;
CREATE TABLE `Position` (
	PositionID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName			ENUM('Dev','Test','Scrum Master','PM') NOT NULL UNIQUE KEY
);

-- create table 3: Account
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email					VARCHAR(255) NOT NULL UNIQUE KEY,
    Username				VARCHAR(255) NOT NULL UNIQUE KEY,
    FullName				VARCHAR(255) NOT NULL,
    DepartmentID 			INT UNSIGNED NOT NULL,
    PositionID				INT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW(),
    FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
);

-- create table 4: Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID 	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName 	VARCHAR(255) NOT NULL UNIQUE KEY,
    CreatorID 	INT UNSIGNED NOT NULL,
    CreateDate  DATETIME DEFAULT NOW()
);

-- create table 5: GroupAccount
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
	GroupID					INT UNSIGNED NOT NULL,
    AccountID				INT UNSIGNED NOT NULL,
    JoinDate				DATETIME DEFAULT NOW(),
    PRIMARY KEY (GroupID,AccountID)
);

-- create table 6: TypeQuestion
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
    TypeID 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName 		ENUM('Esay','Multiple-Choice') NOT NULL UNIQUE KEY
);

-- create table 7: CategoryQuestion
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion(
    CategoryID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName			VARCHAR(255) NOT NULL UNIQUE KEY
);

-- create table 8: Question
DROP TABLE IF EXISTS Question;
CREATE TABLE Question(
    QuestionID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					VARCHAR(255) NOT NULL,
    CategoryID				INT UNSIGNED NOT NULL,
    TypeID					INT UNSIGNED NOT NULL,
    CreatorID				INT UNSIGNED NOT NULL UNIQUE KEY,
    CreateDate				DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(TypeID) 	REFERENCES TypeQuestion(TypeID),
    FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountId)
);

-- create table 9: Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer(
    Answers					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					VARCHAR(255) NOT NULL,
    QuestionID				INT UNSIGNED NOT NULL,
    isCorrect				BIT DEFAULT 1,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
);

-- create table 10: Exam
DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam(
    ExamID					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`					VARCHAR(20) NOT NULL,
    Title					VARCHAR(255) NOT NULL,
    CategoryID				INT UNSIGNED NOT NULL,
    Duration				INT UNSIGNED NOT NULL,
    CreatorID				INT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountId)
);

-- create table 11: ExamQuestion
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
    ExamID				INT UNSIGNED NOT NULL,
	QuestionID			INT UNSIGNED NOT NULL,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES Exam(ExamID),
    PRIMARY KEY (ExamID,QuestionID)
);