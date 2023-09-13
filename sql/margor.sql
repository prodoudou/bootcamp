create database markgor;
use markgor;

drop table employer;
create table employer(
employID integer,
name varchar(10),
deptID integer
);

drop table department;
create table department(
DeptID integer,
name varchar(10)
);

insert into employer values
(1, 'tom', 1),
(2,'mary', 1),
(3,'john', 2),
(4, 'David', 3),
(5, 'Jason', 3),
(6, 'Ray', 6);

insert into department values 
(1, 'sales'),
(2, 'hr'),
(3, 'finance'),
(4, 'dev'),
(5, 'qc');

select * from employer;
select * from department;

-- result 1
select employID, e.name ,d.name as departmentName
from employer e
left join department d on e.DeptID = d.DeptID;

-- result 2
select d.name, sum(e.deptID) as 'No Of Staffs'
from employer e
left join department d
on e.deptID = d.deptID
group by d.name
order by ' No Of Staffs' asc;

SELECT d.name AS DepartmentName, COALESCE(COUNT(e.deptID), 0) AS 'No Of Staffs'
FROM department d
LEFT JOIN employer e ON d.DeptID = e.deptID
GROUP BY d.name
ORDER BY 'No Of Staffs' asc;

select department, sum(count) from
(select Department.Name, count(*) as count
from Department 
left join Employer
on Department.DeptID = Employer.DeptID)
group by Department);

select department.name, count(*) as count
from department 
left join employer 
on department.deptID = employer.deptID;


