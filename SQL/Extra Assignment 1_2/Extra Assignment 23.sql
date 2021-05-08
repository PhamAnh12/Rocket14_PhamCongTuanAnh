DROP DATABASE IF EXISTS Exercise23 ;
CREATE DATABASE IF NOT EXISTS  Exercise23;
CREATE TABLE Exercise2 (
   ID INT  AUTO_INCREMENT PRIMARY KEY,  
   `Name` VARCHAR(50),
   `Code` VARCHAR(50),
   ModifiedDate DATETIME
   
);
CREATE TABLE Exercise3(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    `Name`  VARCHAR(50),
    BrithDay DATE,
	Gender ENUM('0','1','NULL'),
    IsDelleteFlag ENUM('0','1')
    
)
