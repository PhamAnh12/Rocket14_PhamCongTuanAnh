USE testingsystem_3;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS  Get_Department;
DELIMITER $$
  CREATE PROCEDURE Get_Account_Department(IN IN_department_name VARCHAR(20), OUT Out_FullName VARCHAR(50)  )
        BEGIN 
           SELECT   a.FullName INTO  Out_FullName
           FROM `Account` a 
           INNER JOIN Department p ON a.DepartmentID = p.DepartmentID 
           WHERE p.DepartmentName = IN_department_name;
        END       
DELIMITER ;
-- USE
SET  ='';
CALL Get_Account_Department('Bảo vệ',);
SELECT  Full_Name; 