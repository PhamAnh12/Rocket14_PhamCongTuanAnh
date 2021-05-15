USE testingsystem_3;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 
    a.AccountID,
    a.Email,
    a.Username,
    a.FullName,
    IF(d.DepartmentName IS NULL,
        'Nhan vien nay chua thuoc phong ban nao',
        d.DepartmentName) AS DepartmentName
FROM
    `account` a
LEFT JOIN
    department d ON a.DepartmentID = d.DepartmentID;
 -- Câu 3 Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT    a.AccountID, a.Email, a.Username, a.FullName,a.CreateDate,d.DepartmentName
FROM     `account` a
LEFT JOIN department d 
ON        a.DepartmentID = d.DepartmentID
WHERE     a.CreateDate > '2010-12-20';
--  Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT      d.DepartmentName, COUNT(a.AccountID) AS SONHANVIEN
FROM        department d 
INNER JOIN `account` a  
ON          d.DepartmentID = a.DepartmentID
GROUP BY    d.DepartmentID 
HAVING      SONHANVIEN > 3;
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT      q.Content ,COUNT(eq.ExamID) AS'SO LUONG'
FROM        question q
INNER JOIN  examquestion eq 
ON          q.QuestionID = eq.QuestionID
GROUP BY    eq.QuestionID
HAVING      COUNT(eq.QuestionID) = (  SELECT COUNT(ExamID) FROM examquestion GROUP BY QuestionID ORDER BY COUNT(ExamID) DESC LIMIT 1);
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT     cq.CategoryName, q.Content, COUNT(q.QuestionID) AS 'Thong Ke '
FROM       categoryquestion cq
INNER JOIN question q 
ON         cq.CategoryID = q.CategoryID
GROUP BY   cq.CategoryID
ORDER BY   cq.CategoryName ASC;
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT     q.Content , count(eq.ExamID) AS 'Thong Ke'
FROM       question q
LEFT JOIN  examquestion eq ON q.QuestionID = eq.QuestionID
GROUP BY   q.Content
ORDER BY   Count(eq.ExamID);
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT    q.Content, count(an.AnswerID) AS 'Total'
FROM      question q
LEFT JOIN answer an  
ON        q.QuestionID = an.QuestionID
GROUP BY  q.QuestionID
HAVING    Count(an.AnswerID) = (SELECT count(AnswerID) FROM answer GROUP BY QuestionID ORDER BY count(AnswerID) DESC LIMIT 1);
-- Question 9: Thống kê số lượng account trong mỗi group
SELECT     g.GroupName, Count(ga.AccountID) AS 'Thong Ke so account'
FROM       `group` g
LEFT JOIN  Groupaccount ga 
ON         g.GroupID = ga.GroupID
GROUP BY   g.GroupID
ORDER BY   Count(ga.AccountID) DESC;
-- Question 10: Tìm chức vụ có ít người nhất
SELECT      P.PositionName, count(a.AccountID) AS 'Chuc vu it nguoi nhat'
FROM        position p
INNER JOIN `account` a 
ON          p.PositionID = a.PositionID
GROUP BY    p.PositionID 
HAVING      count(a.AccountID) = (SELECT count(AccountID) FROM `account` GROUP BY PositionID  ORDER BY  count(AccountID) LIMIT 1);
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT     d.DepartmentName, p.PositionName, count(a.AccountID) AS 'Thong Ke'
FROM       department d
LEFT JOIN `account` a  
ON         d.DepartmentID = a.DepartmentID
LEFT JOIN  position p 
ON         a.PositionID = p.PositionID
GROUP BY   d.DepartmentID,p.PositionID
ORDER BY   count(a.AccountID);
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của 
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì,
SELECT     q.Content AS 'Noi Dung Cau Hoi', tq.TypeName AS 'Kieu Cau Hoi' , q.CreatorID AS 'Nguoi Tao' , an.Content AS 'Cau Tra Loi',q.CreateDate AS 'Ngay Tao'
FROM       typequestion tq 
INNER JOIN question q 
ON         tq.TypeID = q.TypeID
INNER JOIN answer an 
ON         q.QuestionID = an.QuestionID;
-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		T.TypeName AS 'LOAI CAU HOI', COUNT(q.QuestionID) AS 'SO LUONG'
FROM		Question q
INNER JOIN 	TypeQuestion t ON q.TypeID = t.TypeID
GROUP BY	Q.TypeID;
-- Question 14:Lấy ra group không có account nào Question 15: Lấy ra group không có account nào
SELECT DISTINCT g.GroupName
FROM		   `Group` g 
LEFT JOIN      groupaccount ga  
ON             g.GroupID = ga.GroupID
WHERE          ga.AccountID IS NULL;
-- Question 16: Lấy ra question không có answer nào
SELECT *
FROM  question
WHERE QuestionID  NOT IN (SELECT QuestionID FROM answer );
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT	   a.Email,a.Username,a.FullName
FROM	  `account` a 
INNER JOIN groupaccount ga  
ON         a.AccountID = ga.AccountID
WHERE 	   ga.GroupID = 1;
-- b) Lấy các account thuộc nhóm thứ 2
SELECT	   a.Email,a.Username,a.FullName
FROM	`  account` a 
INNER JOIN groupaccount ga  
ON         a.AccountID = ga.AccountID
WHERE      ga.GroupID = 2;
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT	   a.Email,a.Username,a.FullName
FROM	  `account` a 
INNER JOIN groupaccount ga  
ON         a.AccountID = ga.AccountID
WHERE      ga.GroupID = 1
UNION 
SELECT	   a.Email,a.Username,a.FullName
FROM	  `account` a 
INNER JOIN groupaccount ga  
ON         a.AccountID = ga.AccountID
WHERE      ga.GroupID = 2;
-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
SELECT	   g.GroupName, Count(ga.AccountID)
FROM	   `Group` g 
INNER JOIN groupaccount ga  
ON         g.GroupID = ga.GroupID
GROUP BY   ga.GroupID
HAVING     Count(ga.AccountID) > 2;
-- b) Lấy các group có nhỏ hơn 7 thành viên
SELECT	   g.GroupName, Count(ga.AccountID)
FROM	  `Group` g 
INNER JOIN groupaccount ga  
ON         g.GroupID = ga.GroupID
GROUP BY   ga.GroupID
HAVING     Count(ga.AccountID) <  7;
--  c) Ghép 2 kết quả từ câu a) và câu b)
SELECT	   g.GroupName, Count(ga.AccountID)
FROM	  `Group` g 
INNER JOIN groupaccount ga 
ON         g.GroupID = ga.GroupID
GROUP BY   ga.GroupID
HAVING     Count(ga.AccountID) > 2
UNION 
SELECT	   g.GroupName, Count(ga.AccountID)
FROM	   `Group` g 
INNER JOIN groupaccount ga  
ON         g.GroupID = ga.GroupID
GROUP BY   ga.GroupID
HAVING     Count(ga.AccountID) <  7;