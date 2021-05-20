USE adventureworks;
-- Exercise 1: Subquery
-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
--  của ProductSubcategory là 'Saddles'.
SELECT 	`Name`
FROM 	product 
WHERE 	ProductSubcategoryID = (SELECT ProductSubcategoryID  FROM productsubcategory WHERE `Name` = 'Saddles' )
;
-- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
SELECT 	`Name`
FROM 	product 
WHERE 	ProductSubcategoryID IN (SELECT ProductSubcategoryID  FROM productsubcategory WHERE `Name` LIKE '%Bo%' )
;
-- Question 3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring
-- Bike (nghĩa là ProductSubcategoryID = 3)
SELECT `Name`
FROM 	product 
WHERE  	ListPrice =  (SELECT   MIN(ListPrice)  FROM product  WHERE ProductSubcategoryID = 3  ) AND ProductSubcategoryID = 3
;
-- Exercise 2: JOIN nhiều bảng
-- Question 1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks 2008sample database
SELECT     co.`name` AS Country, sp.`name`Province
FROM       countryregion co
INNER JOIN stateprovince sp
ON         co.CountryRegionCode = sp.CountryRegionCode;
-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country
-- Germany và Canada
SELECT     co.`name` AS Country, sp.`name`Province
FROM       countryregion co
INNER JOIN stateprovince sp
ON         co.CountryRegionCode = sp.CountryRegionCode
WHERE      co.`name` = 'Canada' OR  co.`name` = 'Germany' 
ORDER BY   co.`name`;
-- Question 3:
-- Từ bảng SalesPerson, chúng ta lấy cột BusinessEntityID (là định danh của người sales), 
-- Bonus and the SalesYTD (là đã sale được bao nhiêu người trong năm nay)
-- Từ bảng SalesOrderHeader, chúng ta lấy cột SalesOrderID OrderDate
SELECT  soh.SalesOrderID ,soh.OrderDate ,  sp.SalesPersonID, 
	    (SELECT SalesPersonID FROM  salesperson WHERE SalesPersonID  =soh.SalesPersonID) AS BusinessEntityID,sp.Bonus ,sp.SalesYTD
FROM    salesorderheader soh
INNER JOIN  salesperson sp
ON      soh.SalesPersonID = sp.SalesPersonID;
-- Question 4:
-- Sử dụng câu query ở question 3, thêm cột JobTitle and xóa cột SalesPersonID vàBusinessEntityID.
SELECT   soh.SalesOrderID ,soh.OrderDate , 
        (SELECT Title FROM  employee WHERE ContactID = soh.ContactID ) AS Jobtitle,sp.Bonus ,sp.SalesYTD
FROM    salesorderheader soh
INNER JOIN  salesperson sp
ON      soh.SalesPersonID = sp.SalesPersonID;


