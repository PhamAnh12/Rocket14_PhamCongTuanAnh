DROP DATABASE IF EXISTS qlfresher;
CREATE DATABASE qlfresher;
DROP TABLE IF EXISTS TRainee;
CREATE TABLE Trainee (
TraineeID INT AUTO_INCREMENT PRIMARY KEY,
Full_Name VARCHAR(50),
Birth_Date DATE,
Gender ENUM ('male', 'female', 'unknown'),
ET_IQ TINYINT  CHECK (ET_IQ >=0 AND ET_IQ <= 20),
ET_Gmath TINYINT  ,
ET_English TINYINT   CHECK (ET_English >=0 AND ET_English <= 50) ,
Training_Class  VARCHAR(50),
Evaluation_Note VARCHAR(50),
VTI_Account  VARCHAR(50) NOT NULL UNIQUE
);