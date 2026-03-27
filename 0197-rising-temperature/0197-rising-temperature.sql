# Write your MySQL query statement below
-- select id
-- from (
--     select id,recorddate,temperature,
--     lag(temperature) over(order by recordDate) as prev_temp,
--     LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
--     FROM Weather
-- )t
-- where temperature>prev_temp and datediff(recorddate,prev_date)=1;

SELECT w1.id from Weather w1 join Weather w2
on datediff(w1.recordDate, w2.recordDate)=1
where w1.temperature>w2.temperature;