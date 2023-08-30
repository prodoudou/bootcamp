-- 22 Aug
use sys;
show tables;
CREATE TABLE TEACHER (
  ID INTEGER NOT NULL, -- AUTO_INCREMENT
  NAME VARCHAR(20) NOT NULL, 
  AGE NUMERIC(3) NOT NULL, -- NUMERIC(3) means INTEGER
  NATIONALITY VARCHAR(2) NOT NULL, -- HK, CN, US, UK
  MEMBERSHIP VARCHAR(1) NOT NULL -- S, G
);
-- Select Data from Table, * means all columns
select * from TEACHER;
select id, name, age from TEACHER;
-- Insert records
-- All column alias
insert into teacher (id, name, age, nationality, membership) 
	values (1, 'John Lau', 23, 'HK', 'G');
insert into teacher values (2, 'Mary Lau', 27, 'CN', 'G');
-- 
CREATE TABLE STAFF (
  ID INTEGER NOT NULL, -- NUMERIC(4) equals NUMERIC(4,0)
  NAME VARCHAR(20) NOT NULL, 
  SALARY NUMERIC(10,2) -- Nullable, 8 digits goes to Integer, 2 belongs to decimal
);
-- All column alias
Delete from staff;
insert into staff (id, name, salary)
	values (1, 'John Lau', 10010000.23);
insert into staff (name, id, salary)
	values ('Eric Cheung', 4, 10010000.23);
insert into staff values (2, 'Mary Lau', null);
insert into staff (id, name) values (3, 'Peter Chu');
insert into staff (id, name, salary) values (5, 'John Lau', 20000.00);
-- Update 
update staff set salary = salary + 1000;
-- select data by criteria
select * from staff where id = 1;
select * from staff where name = 'John Lau' and salary < 50000;
select id from staff where name = 'John Lau' and salary < 50000;
select * from staff where name = 'John Lau' or name = 'Mary Lau';
select * from staff where name in ('John Lau', 'Mary Lau'); -- OR
select id, name as fullname, salary from staff;
-- Update by criteria
update staff set salary = salary + 1000 where id = 4;
update staff set salary = salary + 10, name = 'Mary Chan' where name = 'Mary Lau';
-- Delete by criteria
delete from staff where id = 5;
delete from staff where id in (1, 2);
-- Order by (sorting)
insert into staff values (10, 'ABC', 100000);
insert into staff values (11, 'DEF', 34567);
insert into staff values (12, 'IJK', 2000);
select * from staff order by salary; -- default ascending order
select * from staff order by salary asc; -- same as the above
select * from staff order by salary desc; -- descending order
insert into staff values (13, 'BCD', 100000);
select * from staff order by salary asc, name desc; -- sort salary asc first, then name desc

-- Sub-query
select max(salary) from staff;
select id from staff where salary = (select max(salary) from staff);
select id from staff where salary = (select min(salary) from staff);

-- Function
select avg(salary) as AVERAGE_SALARY from staff;
select upper(name) as UPPER_CASE_NAME from staff;
select lower(name) as LOWER_CASE_NAME from staff;
insert into staff values (13, 'PETER CHU', 22000);
insert into staff values (14, 'peter chu', 21000);
select * from staff where upper(name) = 'PETER CHU';

-- Like (case-insensitive in MySQL, case-sensitive in Oracle)
select * from staff where upper(name) like '% CHU'; -- % means any character
select * from staff where upper(name) like '%TER%'; -- % means any character
select * from staff where upper(name) like '%TER%' OR name = 'BCD';

-- count()
select * from staff;
select 1 from staff;
select count(*) from staff; -- 8
select count(1) from staff; -- 8

-- group by
select upper(name) as NAME, 
sum(salary) as TOTAL_SALARY,  -- "salary" column is not allowed
avg(salary) as AVG_SALARY,
max(salary) as max_salary,
min(salary) as min_salary
from staff
group by upper(name);

-- String Operations
select *  from staff where instr(name, 'chu') > 0; -- case-insensitive
select *  from staff where length(name) > 10;
select substring(name, 1, 3)  from staff;
select length(trim(' testing something ')) from dual;
select ltrim(' testing something ') from dual;
select concat(rtrim(' testing something '), ' ABC') from dual; -- dual = 1 x 1 table
select replace('I love Java', 'Java', 'Python') from dual;

SELECT name, max(salary), count(name)
FROM STAFF WHERE SUBSTRING(NAME, 1, 1) IN ('P','E') -- 1st filter, before group by
GROUP BY NAME Having count(name) > 2; -- 2nd filter

SELECT name, max(salary), count(name)
FROM STAFF WHERE SUBSTRING(NAME, 1, 1) IN ('P','E') -- 1st filter, before group by
GROUP BY NAME Having max(salary) > 1000000; -- 2nd filter

INSERT INTO STAFF VALUES(20, 'ERIC CHEUNG', 200);

SELECT name, min(salary), count(name)
FROM STAFF WHERE SUBSTRING(NAME, 1, 1) IN ('P','E') -- 1st filter, before group by
GROUP BY NAME 
Having max(salary) > 1000000; -- 2nd filter
 
 select name , max(salary) from staff  GROUP BY NAME having max(salary) > 1000000;

 SELECT NAME 
 FROM STAFF 
 GROUP BY NAME 
 Having max(salary) > 1000000; -- 2nd filter
 
 SELECT * FROM STAFF;

SELECT DISTINCT NAME, SALARY FROM STAFF;

-- 23 aug
DROP TABLE CUSTOMERS;
CREATE TABLE CUSTOMERS(
	ID INTEGER NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(50) NOT NULL,
    VIP VARCHAR(1) NOT NULL
    -- ORDER_ID INTEGER NOT NULL -- OPTION2
);

ALTER TABLE CUSTOMERS
DROP COLUMN ORDER_ID;

-- ONE TO MANY (ONE CUSTOMER MAY HAVE MANY ORDERS)
CREATE TABLE ORDERS (
	ID INTEGER NOT NULL,
    AMOUNT NUMERIC(9,2) NOT NULL,
    CUSTOMER_ID INTEGER NOT NULL -- OPTION 1
);

DROP TABLE ITEMS;
CREATE TABLE ITEMS(
ID INTEGER NOT NULL,
AMOUNT NUMERIC(9,2) NOT NULL,
DESCRIPTION VARCHAR(100) NOT NULL,
ORDER_ID INTEGER NOT NULL
);

DELETE FROM CUSTOMERS;
insert into customers value( 1, 'JOHN', 'JOHN@GMAIL.COM', 'Y');
insert into customers value( 2, 'MARY', 'MARY@GMAIL.COM', 'N');
insert into customers value( 3, 'ERIC', 'ERIC@GMAIL.COM', 'Y');

DELETE FROM ORDERS;
INSERT INTO ORDERS VALUES(1, 100.23, 1);
INSERT INTO ORDERS VALUES(2, 2000, 1);
INSERT INTO ORDERS VALUES(3, 1550, 2);
INSERT INTO ORDERS VALUES(4, 120, 2);
INSERT INTO ORDERS VALUES(5, 550, 2);

-- ONE TO MANY (ONE ORDER MAY HAVE MANY ITEMS)
DELETE FROM ITEMS;
INSERT INTO ITEMS VALUES(1, 10, 'APPLE',1);
INSERT INTO ITEMS VALUES(2, 20, 'IPHONE', 2);
INSERT INTO ITEMS VALUES(3, 40, 'IPAD',2);
INSERT INTO ITEMS VALUES(4, 5, 'ORANGE',3);
INSERT INTO ITEMS VALUES(5, 500,'LEMON', 4);
INSERT INTO ITEMS VALUES(6, 550, 'BOOK', 5);
INSERT INTO ITEMS VALUES(7, 550,'BOTTLE', 5);


SELECT * FROM CUSTOMERS;
SELECT * FROM ORDERS;
SELECT * FROM ITEMS;

-- JOIN TABLE,  INNER JOIN
SELECT O.CUSTOMER_ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT,
I.DESCRIPTION AS ITEM_DESC,
I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C
INNER JOIN ORDERS O ON C.ID = O.CUSTOMER_ID -- -- INSERT BY KEY" ON STATEMENT -- 
INNER JOIN ITEMS I ON I.ORDER_ID = O.ID;
-- WHERE C.ID =2

-- APPROACH 2: INNER JOIN
SELECT O.CUSTOMER_ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT,
I.DESCRIPTION AS ITEM_DESC,
I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C, ORDERS O, ITEMS I
WHERE C.ID = O.CUSTOMER_ID -- INSERT BY KEY" ON STATEMENT
AND I.ORDER_ID = O.ID;

-- LEFT JOHN
SELECT C.ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT
-- I.DESCRIPTION AS ITEM_DESC,
-- I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C LEFT JOIN ORDERS O ON O.CUSTOMER_ID = C.ID ;

-- RIGHT JOIN
SELECT C.ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT
FROM ORDERS O RIGHT JOIN CUSTOMERS C ON O.CUSTOME_ID = C.ID;


START TRANSACTION;
SELECT * FROM CUSTOMERS;
INSERT INTO CUSTOMERS VALUES(1, 'XYZ', 'XYZ@GMAIL.COM', 'Y');

ROLLBACK; 
COMMIT;

-- PRIMARY KEY
DROP TABLE STUDENT;
CREATE TABLE STUDENTS(
ID INTEGER AUTO_INCREMENT,
NAME VARCHAR(50),
AGE INTEGER(3),
PRIMARY KEY(ID)
);

INSERT INTO STUDENTS(NAME, AGE) VALUES ('JOHN', 23);
INSERT INTO STUDENTS(NAME, AGE) VALUES ('MARY', 18);
SELECT * FROM STUDENTS;

DROP TABLE SUBJECT;
CREATE TABLE SUBJECTS(
ID INTEGER AUTO_INCREMENT,
NAME VARCHAR(50),
PRIMARY KEY(ID)
);

INSERT INTO SUBJECTS(NAME) VALUES ('ENGLISH');
INSERT INTO SUBJECTS(NAME) VALUES ('HISTORY');
INSERT INTO SUBJECTS(NAME) VALUES ('MATHS');
SELECT * FROM SUBJECTS;


-- DDL
CREATE TABLE STUDENT_SUBJECTS(
ID INTEGER AUTO_INCREMENT, 
STUDENT_ID INTEGER NOT NULL,
SUBJECT_ID INTEGER NOT NULL,
PRIMARY KEY(ID),
FOREIGN KEY(STUDENT_ID) REFERENCES STUDENTS(ID),
FOREIGN KEY(SUBJECT_ID) REFERENCES SUBJECTS(ID)
);
SELECT * FROM STUDENT_SUBJECTS;

-- DML
INSERT INTO STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) VALUES (1, 2);
INSERT INTO STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) VALUES (1, 3);
INSERT INTO STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) VALUES (2, 2);
-- ERROR, FOREIGN KEY CONSTRAINT FAILS
-- INSERT INTO STUDENT_SUBJECTS (STUDENT_ID, SUBJECT_ID) VALUES (2, 4);
SELECT * FROM STUDENTS;

-- TRUNCATE ( DELETE ALL DATE FROM TABLE)
TRUNCATE TABLE STUDENT_SUBJECTS;
SELECT * FROM STUDENT_SUBJECTS;

-- ALTER ADD / DROP COLUMN (DDL)
ALTER TABLE STUDENTS ADD EMAIL VARCHAR(50); -- DEFAULT NULL VALUE TO EXISTING RECORDS
ALTER TABLE STUDENTS DROP EMAIL;

-- ALTER COLUMN DEFINITION
ALTER TABLE STUDENTS MODIFY EMAIL VARCHAR(60);
-- ERROR IF DATE THE LENGTH EXCEED THE NEW COLUMN LENGTH
ALTER TABLE STUDENTS MODIFY EMAIL VARCHAR(55); 

-- ON DELETE CASCADE 
DROP TABLE DEPARTMENT;
CREATE TABLE DEPARTMENT(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
DEPT_NAME VARCHAR(50) NOT NULL
);

INSERT INTO DEPARTMENT(DEPT_NAME) VALUE('CS');
INSERT INTO DEPARTMENT(DEPT_NAME) VALUE('MARKETING');

-- ONE TO MANY
DROP TABLE COURSE;
CREATE TABLE COURSE(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
COURSE_NAME VARCHAR(50) NOT NULL,
COURSE_CODE VARCHAR(5) NOT NULL,
DEPT_ID INTEGER NOT NULL,
FOREIGN KEY(DEPT_ID) REFERENCES DEPARTMENT(ID) -- ON DELETE CASCADE
);


INSERT INTO COURSE (COURSE_NAME, COURSE_CODE, DEPT_ID) VALUES ('JAVA', 'CS001', 1);
INSERT INTO COURSE (COURSE_NAME, COURSE_CODE, DEPT_ID) VALUES ('THEORY', 'MT001', 2);
-- INSERT INTO COURSE (COURSE_NAME, COURSE_CODE, DEPT_ID) VALUES ('THEORY', 'MT001', 3);

-- DELETE PARENT(DEPARTMENT)
-- DELETE FROM COURSE WHERE DEPT_ID = 2;
DELETE FROM DEPARTMENT WHERE ID = 2; -- SUCCESS IF THERE IS ON DELETE CASCADE
SELECT * FROM COURSE;
SELECT * FROM DEPARTMENT;
SELECT * 
FROM DEPARTMENT,COURSE ;

-- RENAME COLOUM
ALTER TABLE COURSE RENAME COLUMN COURSE_NAME TO NAME;

ALTER TABLE COURSE ADD COLUMN START_DATE DATE DEFAULT NULL;
ALTER TABLE COURSE ADD COLUMN END_DATE DATE DEFAULT '1900-01-01';

-- MODIFY AND DEFAULT
INSERT INTO COURSE VALUES (3, 'PYHON' , 'CS002', 1 ,NULL, NULL);
ALTER TABLE COURSE MODIFY COLUMN END_DATE DATE DEFAULT '1900-01-01 00:00:00';


-- LIMIT
SELECT * FROM COURSE ORDER BY ID LIMIT 2;

-- OFFSET
SELECT * FROM COURSE ORDER BY ID LIMIT 2 OFFSET 1; -- SKIP 1 ROW


-- EXISTS / NOT EXISTS
INSERT INTO DEPARTMENT (DEPT_NAME) VALUES ('ENG');
INSERT INTO DEPARTMENT (DEPT_NAME) VALUES ('CVIL');

SELECT D.* FROM DEPARTMENT D
WHERE NOT EXISTS( -- CHECK IF . D.ID EXISTS IN COURSE'S DEPT_ID (CHECK ALL ROWS)
SELECT *
FROM COURSE C
WHERE C.DEPT_ID = D.ID -- KEY
);

SELECT * FROM DEPARTMENT;
SELECT * FROM COURSE;
select * 
from course c1, course c2
where c1.id = c2.id;


WITH 
	CS001 AS (
    SELECT *
    FROM COURSE
    WHERE COURSE_CODE = 'CS001'
    ),
    
	CS002 AS (
    SELECT *
    FROM COURSE
    WHERE COURSE_CODE = 'CS002'
    )
    
    SELECT *
    FROM CS002;

-- 28 AUG
SELECT * FROM ORDERS
UNION ALL
SELECT * FROM ORDERS
UNION ALL
SELECT 1000, 10000, 2 FROM DUAL
;

SELECT *
FROM ORDERS;

-- UNION (REMOVE DUPLICATES)
SELECT  * FROM ORDERS
UNION
SELECT * FROM ORDERS
UNION ALL
SELECT * FROM ORDERS -- 6
;

INSERT INTO ORDERS VALUES (5, 550 , 2);
SELECT * FROM ORDERS
;

DROP VIEW VCUSTOMER_ORDERS;

CREATE VIEW VCUSTOMER_ORDERS
AS
SELECT C.ID, C.NAME , O.AMOUNT 
FROM CUSTOMERS C, ORDERS O
WHERE C.ID = O.CUSTOMER_ID
;

SELECT * FROM VCUSTOMER_ORDERS;

DROP PROCEDURE INSERT_RESULT;
-- PROCEDURE INSERT_RESULT
DELIMITER //

CREATE PROCEDURE INSERT_RESULT()

BEGIN	
	DECLARE RES_AVG_AMT DECIMAL(10,2);
    DECLARE cust_id INT;

    DECLARE customer_cursor CURSOR FOR
			SELECT C.ID
			FROM customers c
            ;

    OPEN customer_cursor;
	LOOP     -- Loop through departments
    FETCH customer_cursor INTO cust_id;
		-- logic
		CALL CALC_AVG_AMOUNT(cust_id, RES_AVG_AMT);
        -- INESRT TO RESULT TABLE
        INSERT INTO CUSTOMER_ORDER_REPORT (CUSTOMER_ID, ORDER_AVG_AMT)
        VALUES (cust_id, RES_AVG_AMT);
	END LOOP;
    CLOSE customer_cursor;
END;
//
DELIMITER ;


DROP PROCEDURE CALC_AVG_AMOUNT;
-- CREATE PROCEDURE CALC_AVG_AMOUNT
DELIMITER //



CREATE PROCEDURE CALC_AVG_AMOUNT(IN CID INTEGER, OUT AVG_AMT DECIMAL(10,2))
BEGIN	
		DECLARE cust_id INT;
        DECLARE avg_amount DECIMAL(10,2);

		DECLARE calc_cursor CURSOR FOR
			SELECT o.customer_id, (SUM(o.amount) / count(1)) as avg_order_amt
			FROM customers c, orders o
            where c.id = o.customer_id
            and c.id = CID
            group by o.customer_id
            ;

		OPEN calc_cursor;
		calc_cursor: LOOP     -- Loop through departments
        FETCH calc_cursor INTO cust_id, avg_amount;
		END LOOP;
        CLOSE calc_cursor;

		SET AVG_AMT = avg_amount;
END;
//

DELIMITER ;

ALTER TABLE CUSTOMERS ADD ORDER_COUNT INT;

DELIMITER //
-- TABLE TRIGGER
CREATE TRIGGER TRIGGER_COUNT_ORDER
AFTER INSERT ON ORDERS
FOR EACH ROW
BEGIN
	UPDATE CUSTOMERS
    SET ORDER_COUNT = COALESCE (ORDER_COUNT, 0)+1
    WHERE ID = NEW.CUSTOMER_ID; -- ORDER
    
    -- NEW.AMOUNT, NEW.ID
END;
    //
    DELIMITER;
  
    
    
    