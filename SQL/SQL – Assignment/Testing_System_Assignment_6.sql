USE testingsystem_3;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó
DELIMITER $$
DROP PROCEDURE IF EXISTS get_accountOfDepartment;
CREATE PROCEDURE get_accountOfDepartment(IN in_department_name NVARCHAR(50))
BEGIN
	SELECT 		A.Email, A.Username, A.CreateDate 
    FROM		Department D 
	INNER JOIN 	`Account` A ON D.DepartmentID = A.DepartmentID
    WHERE		DepartmentName = in_department_name;
	
END$$
DELIMITER ;

Call get_accountOfDepartment('Sale');
-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS Count_Account_group;
DELIMITER $$
 CREATE PROCEDURE Count_Account_group( IN In_Group_ID TINYINT(2) ) 
  BEGIN 
     SELECT  GroupID, count(AccountID) 
     FROM GroupAccount
     WHERE GroupID = In_Group_ID
     GROUP BY GroupID;
     
 END$$
 DELIMITER ;
 CALL Count_Account_group(1);
 
--  Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại
DROP PROCEDURE IF EXISTS Count_Question_Typequestion_MonthNow;
DELIMITER $$
CREATE PROCEDURE Count_Question_Typequestion_MonthNow ()
 BEGIN 
   SELECT count(TypeID)
   FROM Question
   WHERE  month(CreateDate) = month(NOW());
END $$
DELIMITER ;
CALL Count_Question_Typequestion_MonthNow ();
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS Count_Typequestion_Max_Question;
DELIMITER $$
CREATE PROCEDURE  Count_Typequestion_Max_Question ()
 BEGIN 
   SELECT TypeID,count(QuestionID)
   FROM Question 
   GROUP BY  TypeID
   HAVING count(QuestionID) = (SELECT count(QuestionID) FROM Question GROUP BY TypeID ORDER BY count(QuestionID)  DESC  LIMIT 1);
END $$
DELIMITER ;
CALL Count_Typequestion_Max_Question();
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS Name_Typequestion_Max_Question;
DELIMITER $$
CREATE PROCEDURE  Name_Typequestion_Max_Question ()
 BEGIN 
   SELECT tq.TypeName,count(q.QuestionID) AS Count_Question
   FROM TypeQuestion tq
   INNER JOIN  Question q ON tq.TypeID = q.TypeID
   GROUP BY  q.TypeID
   HAVING count(QuestionID) = (SELECT count(QuestionID) FROM Question GROUP BY TypeID ORDER BY count(QuestionID)  DESC  LIMIT 1);
END $$
DELIMITER ;

CALL Name_Typequestion_Max_Question();
-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS sp_nameOfGroupOrUserName;
DELIMITER $$
CREATE PROCEDURE sp_nameOfGroupOrUserName
(IN	in_stringInput VARCHAR(50))
BEGIN
	
		SELECT 	a.UserName,g.GroupName
        FROM	`Group` g
        INNER JOIN  GroupAccount ga ON g.GroupID= ga.GroupID
        INNER JOIN `Account` a ON ga.AccountID = a.AccountID
        WHERE	a.UserName LIKE concat('%', in_stringInput,'%') OR g.GroupName LIKE concat('%', in_stringInput,'%') ;
	
END$$
DELIMITER ;

CALL sp_nameOfGroupOrUserName('van');
 -- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
--  sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS Question7;
DELIMITER $$
CREATE PROCEDURE Question7( IN In_Email VARCHAR(100),IN In_FullName VARCHAR(100)  )
 BEGIN 
    INSERT INTO `Account`(Email, Username, FullName, DepartmentID,PositionID, CreateDate)
    VALUES (In_Email,substring_index(In_Email,'@',1),In_FullName,1,1,Now());
    SELECT * FROM `Account` 
    WHERE email = In_Email;
END $$
DELIMITER ;
-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
DROP PROCEDURE IF EXISTS Question8;
DELIMITER $$
CREATE PROCEDURE Question8(IN In_Type_Question VARCHAR(20))
  BEGIN 
    SELECT q.QuestionID,q.content, max(length(q.Content)) AS MAX_Content
    FROM Question q
    INNER JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
    WHERE tq.TypeID  = (SELECT TypeID FROM TypeQuestion WHERE TypeName = In_Type_Question);
 END $$ 
DELIMITER ; 
CALL Question8('Essay');
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE  IF EXISTS Question9;
DELIMITER $$
CREATE PROCEDURE Question9(IN In_Exam_ID INT (2))
 BEGIN 
   DELETE FROM Exam
   WHERE ExamID =In_Exam_ID;
END $$
DELIMITER ;

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS  Question10 ;
DELIMITER $$
CREATE PROCEDURE  Question10()
BEGIN
	WITH ExamID3Year AS(
		SELECT 	ExamID
		FROM 	Exam
		WHERE	(YEAR(NOW()) - YEAR(CreateDate)) > 3
    )
	DELETE
    FROM 	Exam
    WHERE 	ExamID = (SELECT * FROM ExamID3Year);
END$$
DELIMITER ;

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc
 DROP PROCEDURE IF EXISTS  Question11 ;
DELIMITER $$
CREATE PROCEDURE  Question11(IN In_DepartmentName VARCHAR(50))
BEGIN
	
	UPDATE 	`Account`
    SET		DepartmentID = 11
    WHERE	DepartmentID = (SELECT 	DepartmentID	
							FROM	Department
							WHERE 	DepartmentName = in_DepartmentName);
   
	DELETE 
    FROM	Department
    WHERE	DepartmentName = in_DepartmentName;
END $$
DELIMITER ;
CALL Question11('Bán Hàng');
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
 DROP PROCEDURE IF EXISTS  Question12 ;
DELIMITER $$
CREATE PROCEDURE  Question12()
BEGIN 
  SELECT Month(CreateDate),Count(QuestionID)
  FROM Question
  GROUP BY Month(CreateDate);
END $$
DELIMITER ;
CALL Question12();
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất 
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")
DROP TEMPORARY TABLE IF EXISTS Month_6;
CREATE TEMPORARY TABLE Month_6 AS
 SELECT year(sysdate()) AS `Year`, month(sysdate()) AS `Month`
 UNION 
SELECT year(sysdate() -interval 1 month) AS `Year`, month(sysdate()- interval 1 month) AS `Month`
UNION 
SELECT year(sysdate() -interval 2 month) AS `Year`, month(sysdate()- interval 2 month) AS `Month`
UNION 
SELECT year(sysdate() -interval 3 month) AS `Year`, month(sysdate()- interval 3 month) AS `Month`
UNION 
SELECT year(sysdate() -interval 4 month) AS `Year`, month(sysdate()- interval 4 month) AS `Month`
UNION 
SELECT year(sysdate() -interval 5 month) AS `Year`, month(sysdate()- interval 5 month) AS `Month`;

DROP TEMPORARY TABLE  IF EXISTS  Month_Question;
CREATE TEMPORARY TABLE Month_Question AS
SELECT year(CreateDate) AS `Year`, month(CreateDate)  AS `Month`, Count(*) AS Total 
FROM Question 
GROUP BY year(CreateDate) , month(CreateDate);
DROP PROCEDURE IF EXISTS Question13;
DELIMITER $$ 
CREATE PROCEDURE Question13()
BEGIN 
SELECT m.`Month`,m. `Year` , 
CASE  WHEN mq.Total > 0 THEN mq.Total
  ELSE 'không có câu hỏi nào trong tháng' END AS Total
FROM Month_6 m
LEFT JOIN  Month_Question mq ON m.`Year`= mq.`Year` AND m.`Month` = mq.`Month`;
END $$
DELIMITER ;  
CALL Question13();
