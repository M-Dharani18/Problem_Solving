# Write your MySQL query statement below
select id
from (
    select id,recorddate,temperature,
    lag(temperature) over(order by recordDate) as prev_temp,
    LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
    FROM Weather
)t
where temperature>prev_temp and datediff(recorddate,prev_date)=1;