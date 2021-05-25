USE testingsystem_3;
-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước
DROP TRIGGER IF EXISTS Question1;
DELIMITER $$ 
CREATE TRIGGER  Question1
BEFORE  INSERT  ON `Group`
FOR EACH ROW
BEGIN 
  IF  YEAR (NOW()- NEW.CreateDate) >1 THEN 
   SIGNAL SQLSTATE '45000'
   SET MESSAGE_TEXT = ' Year Create Date Group  before 1 year now';
   END IF;
   
END $$
DELIMITER ;
INSERT INTO `Group`( GroupName,CreatorID, CreateDate)
VALUES ('Group123', '2',' 2019-04-01');

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"
DROP TRIGGER IF EXISTS Question2;
DELIMITER $$ 
CREATE TRIGGER Question2
BEFORE INSERT ON `Account`
FOR EACH ROW 
BEGIN 
  IF NEW.DepartmentID = 10 THEN 
  SIGNAL SQLSTATE  '45000'
  SET MESSAGE_TEXT = 'Depaetment Sale cannot add more user';
  END IF;
  END $$
  DELIMITER ;
INSERT INTO `Account`( Email, UserName, FullName, DepartmentID, PositionID,CreateDate)
VALUES('Pham Cong Tuan Anh', 'PhamAnh123', 'Pham Cong Tuan Anh', '10','1', '2021-05-22');
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS Question3;
DELIMITER $$ 
CREATE TRIGGER Question3
BEFORE INSERT    ON GroupAccount 
FOR EACH ROW 
BEGIN 
  IF  NEW.GroupID IN (SELECT GroupID 
					FROM (SELECT GroupID, Count(AccountID) 
						  FROM GroupAccount 
                          GROUP BY GroupID  
                          HAVING Count(AccountID)  = 5) AS TotalAccount)
  THEN  
  SIGNAL SQLSTATE  '45000'
  SET MESSAGE_TEXT = 'Group max 5 account';
  END IF;
  END $$
  DELIMITER ;
  INSERT INTO GroupAccount( GroupID, AccountID,JoinDate)
  VALUES ('1','11', '2021-05-05');
  -- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS Question4;
DELIMITER $$ 
CREATE TRIGGER Question4
BEFORE INSERT    ON ExamQuestion 
FOR EACH ROW 
BEGIN 
  IF  NEW.ExamID IN (SELECT ExamID 
					FROM (SELECT ExamID, Count(QuestionID) AS Total
						  FROM ExamQuestion 
                          GROUP BY ExamID 
                          HAVING Count(QuestionID)  = 10) AS TotalExam)
  THEN  
  SIGNAL SQLSTATE  '45000'
  SET MESSAGE_TEXT = ' Question max 10 Exam ';
  END IF;
  END $$
  DELIMITER ;
-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó
DROP TRIGGER IF EXISTS Question5;
DELIMITER $$
CREATE TRIGGER Question5
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN
	DECLARE Account_ID_123 INT;
    
    SELECT AccountID  INTO Account_ID_123 
    FROM `Account` 
    WHERE Email = OLD.Email;
	
	IF OLD.Email = 'admin@gmail.com' THEN
		SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'This is Admin account, you can not delete!';
	ELSE 
	  DELETE   FROM GroupAccount WHERE AccountID  =  Account_ID_123 ;
	   UPDATE `Group` SET CreatorID = NULL WHERE CreatorID  =  Account_ID_123;
        UPDATE Exam  SET CreatorID = NULL WHERE CreatorID  =  Account_ID_123;
        UPDATE Question SET CreatorID = NULL WHERE CreatorID  =  Account_ID_123;
    END IF;
END$$
DELIMITER ;
DELETE FROM `Account`
WHERE AccountID = 11;
-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
DROP TRIGGER IF EXISTS Question6;
DELIMITER $$ 
CREATE TRIGGER Question6
BEFORE INSERT    ON `Account`
FOR EACH ROW 
BEGIN 
      IF NEW. DepartmentID IS NULL THEN 
	   SET NEW.DepartmentID = (SELECT DepartmentID FROM Department WHERE DepartmentName = 'Phòng Chờ Việc');
 
  END IF;
  END $$
  DELIMITER ;
  INSERT INTO `Account`( Email, UserName, FullName, PositionID,CreateDate)
VALUES('Pham Cong Tuan Anh', 'PhamAnh123', 'Pham Cong Tuan Anh','1', '2021-05-22');
-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng
DROP TRIGGER IF EXISTS Question7;
DELIMITER $$ 
CREATE TRIGGER Question7
BEFORE INSERT   ON Answer
FOR EACH ROW 
BEGIN 
    DECLARE Number_Answer TINYINT;
    DECLARE Number_Answer_True TINYINT;
    SELECT Count(an.AnswerID)  INTO Number_Answer
    FROM Question q
    INNER JOIN Answer an ON q.QuestionID = an.QuestionID
    WHERE QuestionID = NEW.QuestionID;
	SELECT Count(an.AnswerID)  INTO Number_Answer_True
    FROM Question q
    INNER JOIN Answer an ON q.QuestionID = an.QuestionID
    WHERE an.QuestionID = NEW.QuestionID AND an.isCorrect ='1' ;
    IF Number_Answer = 4 THEN 
        SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'One question has a maximum of 4 answers!';
        END IF;
   IF Number_Answer_True = 2 THEN 
        SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'One question has a maximum of 2 answers true!';
     END IF;
  END $$
  DELIMITER ;
 -- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
DROP TRIGGER IF EXISTS Question8;
DELIMITER $$
CREATE TRIGGER Question8
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
	IF NEW.gender = 'Male' THEN 
		SET NEW.gender = 'M';
	ELSEIF NEW.gender = 'Female' THEN
		SET NEW.gender = 'F';
	ELSEIF NEW.gender = 'Unknown' THEN
		SET NEW.gender = 'U';
	END IF;
END$$
DELIMITER ;

INSERT INTO `Account` 
(Email, 						UserName, 			       FullName, 				Gender,			DepartmentID, 		PositionID) 
VALUES
('Phamcongtuananh1@gmail.com', 		'AnhPham1', 		'Pham Cong Tuan Anh1', 		'Male',			1, 					1		   );


-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS Questioon9;
DELIMITER $$
CREATE TRIGGER Question9
BEFORE DELETE ON Exam
FOR EACH ROW
BEGIN
    IF OLD.ExamID IN (SELECT ExamID
					   FROM Exam
                       WHERE DAY(NOW()) - DAY(CreateDate) = 2) THEN
		SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'This exam was created 2 days ago, you can not delete!';
	END IF;
    
    DELETE FROM ExamQuestion
    WHERE ExamID = OLD.ExamID;
END$$
DELIMITER ;

DELETE FROM Exam
WHERE ExamID = 2;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete 
-- các question khi question đó chưa nằm trong exam nào
-- Trigger for update
DROP TRIGGER IF EXISTS Question10;
DELIMITER $$
CREATE TRIGGER Question10
BEFORE UPDATE ON Question
FOR EACH ROW
BEGIN
	IF OLD.QuestionID IN (SELECT  DISTINCT QuestionID FROM ExamQuestion) 
	OR OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM Answer) THEN
		SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'This question exists in exam_question table or answers table or both of them, you can not update!';
	END IF;
END$$
DELIMITER ;

UPDATE Question
SET Content = '1234567890'
WHERE QuestionID = 5;

-- Trigger for delete
DROP TRIGGER IF EXISTS Question10;
DELIMITER $$
CREATE TRIGGER Question10
BEFORE DELETE ON Question
FOR EACH ROW
BEGIN
	IF OLD.QuestionID IN (SELECT  DISTINCT QuestionID FROM ExamQuestion) 
	OR OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM Answer) THEN
		SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'This question exists in exam_question table or answers table or both of them, you can not delete!';
	END IF;
END$$
DELIMITER ;

DELETE FROM  Question

WHERE QuestionID = 5;
-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"
  SELECT `Code`, Title, 
  CASE 
	WHEN Duration <= 30 THEN 'Short time'
    WHEN 30 < Duration <= 60 THEN 'Medium time'
    ELSE 'Long time'
END AS Type_Duration
FROM Exam;
  -- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
SELECT Count(AccountID),
CASE 
  WHEN Count(AccountID)  <= 5 THEN 'Few'
  WHEN 5 < Count(AccountID) <= 20 THEN 'Normal'
  ELSE 'Higher'
  END AS Number_Account
FROM GroupAccount
GROUP BY GroupID;
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"
SELECT  d.DepartmentName,
CASE
  WHEN Count(a.AccountID) = 0 THEN 'Không Có User'
  ELSE  Count(a.AccountID) END  AS Number_Account_DepartMent
FROM Department d
LEFT JOIN `Account` a ON  d.DepartmentID = a.DepartmentID
GROUP BY a.DepartmentID;