USE db_extra_a6;
-- Exercise 1: Tiếp tục với Database ở buổi 6
-- Viết triggers để tránh trường hợp người dùng nhập thông tin module Project không hợp lệ
-- (Project_Modules.ProjectModulesDate < Projects.ProjectStartDate,
-- Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn)
DROP TRIGGER IF EXISTS  Exercise_1;
DELIMITER $$ 
CREATE TRIGGER  Exercise_1
BEFORE  INSERT  ON project_modules
FOR EACH ROW
BEGIN 
   DECLARE V_ProjectSartDate DATETIME;
    DECLARE V_ProjectCompletedOn DATETIME;
   SELECT ProjectSartDate , ProjectCompletedOn INTO  V_ProjectSartDate,V_ProjectCompletedOn
   FROM Project
   WHERE project_modules.ProjectID = Project.ProjectID ;
 
  IF   ProjectModulesDate <   V_ProjectSartDate  OR  ProjectModulesCompletedOn  > V_ProjectCompletedOn THEN 
   SIGNAL SQLSTATE '45000'
   SET MESSAGE_TEXT = ' Nhap Thong tin  module Project không ';
   END IF;
   
END $$
DELIMITER ;

-- Exercise 2: View
-- Trong database phần Assignment 3, Tạo 1 VIEW để lấy ra tất cả các thực tập sinh là
-- ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
-- ET_IQ + ET_Gmath >=20
-- ET_IQ>=8
-- ET_Gmath>=8
--  ET_English>=18
CREATE VIEW Exercise_2 AS
SELECT* 
FROM Trainee
WHERE ET_IQ + ET_Gmath>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English >= 18;