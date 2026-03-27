# Write your MySQL query statement below
select e.name , b.bonus 
from Employee e left join bonus b on e.empId = b.empId where e.empid not in 
( select b.empId from bonus b where b.bonus >=1000);