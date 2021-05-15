USE testingsystem_3;
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE VIEW DanhSach_NhanVien AS
SELECT a.AccountID,a.Email,a.Username,a.FullName ,(SELECT PositionName FROM Position WHERE a.PositionID = PositionID) AS PositionName
FROM `Account` a
INNER JOIN Department d 
ON  a.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Sale';
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE VIEW Account_ThamNhieu_Group AS
SELECT a.AccountID, a.Email,a.Username,a.FullName,count(ga.GroupID)
FROM`Account` a
INNER JOIN  GroupAccount ga 
ON a.AccountID = ga.AccountID
GROUP BY a.AccountID
HAVING count(ga.GroupID) = (SELECT count(GroupID) FROM GroupAccount GROUP BY  AccountID ORDER BY  count(GroupID) DESC LIMIT 1);
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
CREATE VIEW Content_Max AS
SELECT *
FROM Question 
WHERE char_length(content) > 10;
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW Phong_Ban_Nhieu_NV_Nhat AS
SELECT d.DepartmentName ,count(a.AccountID) AS 'So Nhan Vien Max'
FROM Department d
INNER JOIN   `Account` a 
ON d.DepartmentID = a.DepartmentID 
GROUP BY d.DepartmentID
HAVING count(a.AccountID) = (SELECT count(AccountID) FROM `Account` GROUP BY DepartmentID ORDER BY  count(AccountID) DESC LIMIT 1);
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE VIEW Creator_Ho_Nguyen AS
SELECT  q.QuestionID,q.Content,q.CategoryID,q.TypeID, (SELECT FullName FROM `Account` WHERE AccountID = q.CreatorID) AS Creator_Ho_Nguyen
FROM  Question q
WHERE (SELECT FullName FROM `Account` WHERE AccountID = q.CreatorID) LIKE '%Nguyen%'
