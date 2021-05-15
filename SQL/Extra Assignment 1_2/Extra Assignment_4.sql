DROP DATABASE IF EXISTS Extra_Assignment_4;
CREATE DATABASE IF NOT  EXISTS Extra_Assignment_4 ;
/* ======TẠO BẢNG DỮ LIỆU (Q1)========*/
-- Department (Department_Number, Department_Name)
-- Employee_Table (Employee_Number, Employee_Name, Department_Number)
-- Employee_Skill_Table (Employee_Number, Skill_Code, Date Registered)
-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
USE Extra_Assignment_4;
-- Tạo bảng Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name		NVARCHAR(50) UNIQUE KEY NOT NULL
);

-- Tạo bảng Employee_Table
DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name		NVARCHAR(50) NOT NULL,
    Department_Number	TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);

-- Tạo bảng Employee_Skill_Table
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT,
    Skill_Code			NVARCHAR(20) NOT NULL,
    Date_Registered		DATETIME DEFAULT NOW(),
    FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);
-- Question 2: Thêm ít nhất 10 bản ghi vào table
INSERT INTO Department	(Department_Name) 
VALUE 					(N'Marketing'	),
						(N'Sale'		),
						(N'Bảo vệ'		),
						(N'Nhân sự'		),
						(N'Kỹ thuật'	),
						(N'Tài chính'	),
						(N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	);


INSERT INTO Employee_Table 	(Employee_Name		, Department_Number	)
VALUE						(N'Lê Tuấn Anh'	,		   1			),
							(N'	Mai Văn Bộ'	,		    1			),
                            (N'Nguyễn Văn Dũng'	,		2			),
                            (N'Phan Xuân Đức'	,		5			),
                            (N'Phạm Hoàng Hà'	,		6			),
                            (N'Nguyễn Thị Hân'	,		5			),
                            (N'	Lê Thanh Hiến'	,	    6			),
                            (N'Nguyễn Vũ Hiệp'	,	    1			),
                            (N'Nguyễn Trung Hiếu',      9			),
                            (N'Chu Bá Thông'	,		10			);


INSERT INTO Employee_Skill_Table 	(Employee_Number, Skill_Code	, Date_Registered	)
VALUE								( 	1,				'Java'		, '2021-03-15'		),
									( 	2,				'Android'	, '2021-03-16'		),
									( 	3,				'C#'		, '2021-03-17'		),
									( 	1,				'SQL'		, '2021-03-20'		),
									( 	1,				'Postman'	, '2021-03-21'		),
									( 	4,				'Ruby'		, '2021-04-22'		),
									( 	5,				'Java'		, '2021-04-24'		),
									( 	6,				'C++'		, '2021-04-27'		),
									( 	7,				'C Sharp'	, '2021-04-04'		),
									( 	10,				'PHP'		, '2021-04-10'		);

   
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
SELECT et.Employee_Name,es.Date_Registered
FROM Employee_Table et
LEFT JOIN Employee_Skill_Table es ON et.Employee_Number = es.Employee_Number
WHERE es.Skill_Code = 'Java';
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >2 nhân viên
SELECT d.Department_Name, count(et.Employee_Number) AS 'So Luong'
FROM department d 
LEFT JOIN employee_table et 
ON d.Department_Number = et.Department_Number
GROUP BY d.Department_Number
HAVING  count(et.Employee_Number)> 2
ORDER BY count(et.Employee_Number);

 -- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban
SELECT et.*,d.Department_Name
FROM employee_table et 
LEFT JOIN  department d
ON et.Department_Number = d.Department_Number
ORDER BY d.Department_Number;
-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT et.*, count(es.Skill_Code)
FROM employee_table et 
INNER JOIN employee_skill_table es
ON  et.Employee_Number = es.Employee_Number
GROUP BY  et.Employee_Number 
HAVING count(es.Skill_Code) > 1
ORDER BY count(es.Skill_Code) 