DROP DATABASE IF EXISTS qlfresher;
CREATE DATABASE IF NOT  EXISTS qlfresher;
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee (
    TraineeID 			INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name 			VARCHAR(255),
    Birth_Date 			DATE,
    Gender 				ENUM('male', 'female', 'unknown'),
    ET_IQ 				TINYINT CHECK (0 < ET_IQ < 20),
    ET_Gmath 			TINYINT CHECK (0 < ET_Gmath < 20),
    ET_English 			TINYINT CHECK (0 < ET_English < 50),
    Training_Class 		VARCHAR(50),
    Evaluation_Note 	VARCHAR(255),
	VTI_Account	 VARCHAR(50) NOT NULL UNIQUE KEY

);


