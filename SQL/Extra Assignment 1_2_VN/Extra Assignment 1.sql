DROP DATABASE IF EXISTS qlfresher;
CREATE DATABASE qlfresher;
CREATE TABLE Trainee (
TraineeID INT AUTO_INCREMENT PRIMARY KEY,
Full_Name VARCHAR(50),
Birth_Date DATE,
Gender ENUM ('male', 'female', 'unknown'),
ET_IQ TINYINT,
ET_Gmath TINYINT,
ET_English TINYINT,
Training_Class  VARCHAR(50),
Evaluation_Note VARCHAR(50),
VTI_Account  VARCHAR(50) NOT NULL UNIQUE
);