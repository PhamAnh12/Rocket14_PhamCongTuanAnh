DROP DATABASE IF EXISTS DB_Extra_A6;
CREATE DATABASE DB_Extra_A6 ;
USE DB_Extra_A6;
/* =====TẠO BẢNG DỮ LIỆU========*/
DROP TABLE IF EXISTS Project_Modules;
CREATE TABLE Project_Modules
(
	ModuleID 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ProjectID					TINYINT UNSIGNED NOT NULL,
    EmployeeID					TINYINT UNSIGNED NOT NULL,
    ProjectModulesDate			DATETIME DEFAULT NOW(),
    ProjectModulesOn			DATETIME DEFAULT NOW(),
    ProjectModulesDescription	NVARCHAR(50)
);
DROP TABLE IF EXISTS Projects;
CREATE TABLE Projects(
	ProjectID 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ManagerID					TINYINT	UNSIGNED NOT NULL,
    ProjectName 				NVARCHAR(50) NOT NULL,
    ProjectStartDate			DATETIME DEFAULT NOW(),
    ProjectDescription			NVARCHAR(50) NOT NULL,
    ProjectDetail				NVARCHAR(50) NOT NULL,
    ProjectCompletedOn			DATETIME DEFAULT NOW()
);
DROP TABLE IF EXISTS Work_Done;
CREATE TABLE Work_Done(
	WorkDoneID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    EmployeeID					TINYINT UNSIGNED NOT NULL,
    ModuleID					TINYINT UNSIGNED NOT NULL,
    WorkDoneDate				DATETIME DEFAULT NOW(),
    WorkDoneDescription			NVARCHAR(50) NOT NULL,
    WorkDoneStatus				BIT NOT NULL -- 1: Hoàn thành, 0: Không hoàn thành
);
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
	EmployeeID 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    EmployeeLastName			NVARCHAR(30) NOT NULL,
    EmployeeFirstName			NVARCHAR(30) NOT NULL,
    EmployeeHireDate			DATETIME DEFAULT NOW(),
    EmployeeStatus				BIT NOT NULL,
    SupervisorID				TINYINT UNSIGNED NOT NULL,
    SocialSecurityNumber		CHAR(5)
);





/* ====INSERT DỮ LIỆU===== */
INSERT INTO Project_Modules (ProjectID	, EmployeeID, ProjectModulesDate, ProjectModulesOn	, ProjectModulesDescription	)
VALUE						(	1		,	1		,	'2019-06-06'	, '2019-06-06'		,	'Làm đúng hạn'			),
							(	2		,	2		,	'2019-07-06'	, '2019-06-06'		,	'Làm trước hạn'			),
                            (	3		,	3		,	'2019-08-06'	, '2019-09-06'		,	'Làm quá hạn'			),
                            (	4		,	1		,	'2019-07-06'	, '2019-06-06'		,	'Làm trước hạn'			);

INSERT INTO Projects		 ( ManagerID , ProjectName 		, ProjectStartDate	, ProjectDescription	, ProjectDetail		, ProjectCompletedOn	)
VALUE						(	1		,'Java'				,	'2019-06-06'	, 'Làm đúng vào'		,'Làm đúng hạn'		,	'2019-08-06'		),
							(	2		,'C#'				,	'2019-07-06'	, 'Làm nhanh lên'		,'Làm trước hạn'	,	'2019-09-06'		),
                            (	3		,'Android'			,	'2019-08-06'	, 'Nộp trước ngày 17/3'	,'Làm quá hạn'		,	'2019-10-06'		),
                            (	1		,'C++'				,	'2019-07-06'	, 'Không biết đừng làm'	,'Làm trước hạn'	,	'2019-11-06'		);

INSERT INTO Work_Done		( EmployeeID, ModuleID	, WorkDoneDate	, WorkDoneDescription	, WorkDoneStatus	)
VALUE						(	1		,	1		,'2019-06-06'	, 'Làm được phết'		,		1			),
							(	2		,	2		,'2019-07-06'	, 'Làm ổn phết'			,		1			),
                            (	3		,	3		,'2019-08-06'	, 'Không biết làm'		,		0			),
                            (	1		,	4		,'2019-07-06'	, 'Không biết ko làm'	,		0			);
INSERT INTO Employee		( EmployeeLastName	, EmployeeFirstName	, EmployeeHireDate	, EmployeeStatus, SupervisorID	, SocialSecurityNumber	)
VALUE						(N'Nguyễn Hải'		,N'Đăng'			,'2019-06-06'		, 		1		,		1		,'SS001'				),
							(N'Lê Thị'			,N'Thư'				,'2019-07-06'		, 		1		,		1		,'SS002'				),
                            (N'Nguyễn Hữu'		,N'Thắng'			,'2019-08-06'		, 		1		,		2		,'SS003'				),
                            (N'Dương Văn'		,N'Hữu'				,'2019-07-06'		, 		0		,		2		,'SS004'				);
-- b) Viết stored procedure (không có parameter) để Remove tất cả thông tin
-- project đã hoàn thành sau 3 tháng kể từ ngày hiện. In số lượng record đã
-- remove từ các table liên quan trong khi removing (dùng lệnh print)
DROP PROCEDURE IF EXISTS delete_project_3month_ago;
DELIMITER $$
CREATE PROCEDURE delete_project_3month_ago()
BEGIN
 -- Khai báo ra 3 biến để lưu thông tin số lượng bản ghi sẽ xóa trong các bảng.
 DECLARE remove_project INT(2);
 DECLARE remove_project_modules INT(2);
 DECLARE remove_work_done INT(2);
 -- Đếm số lượng bản ghi sẽ được xóa và lưu vào biến
	SELECT count(*) INTO remove_project 
	FROM projects 
	WHERE ProjectCompletedOn < SYSDATE() - interval 3 month;
    -- 
	SELECT count(*) INTO remove_project_modules 
	FROM project_modules 
	WHERE ProjectID IN (SELECT ProjectID FROM projects WHERE ProjectCompletedOn < SYSDATE() - interval 3 month);
    -- 
	SELECT count(*) INTO remove_work_done 
	FROM work_done 
	WHERE ModuleID IN (SELECT ModuleID FROM project_modules WHERE ProjectID IN (SELECT ProjectID FROM projects WHERE ProjectCompletedOn < SYSDATE() - interval 3 month));
 -- chèn lệnh xóa vào đây (lưu ý xóa từ workdone -> module -> project)
 DELETE FROM work_done WHERE ModuleID IN (SELECT ModuleID FROM project_modules WHERE ProjectID IN (SELECT ProjectID FROM projects WHERE ProjectCompletedOn < SYSDATE() - interval 3 month));
 DELETE FROM project_modules WHERE ProjectID IN (SELECT ProjectID FROM projects WHERE ProjectCompletedOn < SYSDATE() - interval 3 month);
 DELETE FROM projects WHERE ProjectCompletedOn < SYSDATE() - interval 3 month;
 -- In kết quả số lượng bản ghi được xóa.
 SELECT 'Số lượng bản ghi bị xóa trong project' AS description, remove_project
 union
 SELECT 'Số lượng bản ghi bị xóa trong project_modules', remove_project_modules
 union
 SELECT 'Số lượng bản ghi bị xóa trong work_done', remove_work_done;
END $$
DELIMITER ;
CALL delete_project_3month_ago();
-- c) Viết stored procedure (có parameter) để in ra các module đang được thực  hiện)
DROP PROCEDURE IF EXISTS Module_Processing;
CREATE PROCEDURE Module_Processing()
BEGIN
   SELECT ModuleID,ProjectID,ProjectModulesDate,ProjectModulesOn
   FROM project_modules
   WHERE ProjectModulesOn > SYSDATE()
END $$
DELIMITER ;
-- d) Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc
-- dù không ai giao việc cho nhân viên đó (trong bảng Works)
DELIMITER $$ 
CREATE FUNCTION    employee_participated() RETURNS TINYINT
BEGIN 
DECLARE EmployeeID_Par TINYINT ;
SELECT EmployeeID  INTO EmployeeID_Par
FROM employee
WHERE  SupervisorID IS NULL AND EmployeeID IN (SELECT EmployeeID FROM Work_done); 
 RETURN EmployeeID_Par;
END $$
DELIMITER ;
