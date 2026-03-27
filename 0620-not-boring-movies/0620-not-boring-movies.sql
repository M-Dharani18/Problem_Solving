# Write your MySQL query statement below
select * from cinema where id not in(
    select id from cinema where description='boring' or id%2=0
)order by rating desc;