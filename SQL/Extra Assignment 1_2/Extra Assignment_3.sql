USE qlfresher1;
-- Question 1: Thêm ít nhất 10 bản ghi vào table
-- Them du lieu vao bang Traineetrainee
INSERT INTO Trainee (   Full_Name		,   Birth_Date	, Gender	, ET_IQ	, ET_Gmath	, ET_English	, Training_Class	, Evaluation_Note	, VTI_Account		)
VALUE 				('Nguyễn Hải An '	,  '2000-02-29'	, 'male'	,	20	,	20		,	20			,		'VTI001'	,		'Very good'	,	'Anblack'		),
					('Nguyễn Văn Bảo'	,  '2000-04-09'	, 'male'	,	18	,	16		,	16			,		'VTI002'	,		'Normal'	,	'bao123'		),
                    ('Hoàng Thị Hồng'	,  '2000-07-22'	, 'female'	,	11	,	17		,	10			,		'VTI003'	,		'Good'		,	'hong6969'		),
                    ('Phạm Anh Tuấn '	,  '2000-07-24'	, 'male'	,	20	,	12		,	20			,		'VTI004'	,		'Good'		,	'tuan123'		),
                    ('Ngô Bá Thịnh '	,  '2000-08-05'	, 'male'	,	16	,	20		,	16			,		'VTI005'	,		'Normal'	,	'thinh6996'		),
                    ('Nguyễn Văn Dũng'	,  '2000-09-08'	, 'female'	,	19	,	10		,	19			,		'VTI006'	,		'Good'		,	'dungtroc123'		),
                    ('Nguyễn Hải Hậu'	,  '2000-11-11'	, 'male'	,	20	,	19		,	18			,		'VTI007'	,		'Normal'	,	'hauhoanggia123'		),
                    ('Tống Quang Anh'	,  '2000-12-12'	, 'female'	,	15	,	20		,	17			,		'VTI008'	,		'Good'		,	'antondev'		),
                    ('Nguyễn Thị Chiến'	,  '2000-12-13'	, 'unknown'	,	20	,	19		,	20			,		'VTI009'	,		'Normal'	,	'chienpanda'	),
					('Nguyễn Thị Hảo'	,  '2000-12-28'	, 'female'	,	20	,	19		,	15			,		'VTI010'	,		'Good'		,	'haohaochucay'	);
                    
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, 
-- nhóm chúng thành các tháng sinh khác nhau
SELECT * FROM Trainee;
-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT * 
FROM Trainee
WHERE length(Full_Name ) = (SELECT MAX(length(Full_Name)) FROM Trainee);
-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
-- những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
-- ET_IQ + ET_Gmath>=20
-- ET_IQ>=8
-- ET_Gmath>=8
-- ET_English>=18
SELECT* 
FROM Trainee
WHERE ET_IQ + ET_Gmath>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English >= 18;
-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE FROM Trainee 
WhERE TraineeID = '5';
-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật
-- thông tin vào database
UPDATE  Trainee
SET Training_Class = 'VTI002'
WHERE TraineeID = '3';


