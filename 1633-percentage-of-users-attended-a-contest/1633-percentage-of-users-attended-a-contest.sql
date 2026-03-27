# Write your MySQL query statement below
select contest_id , round(count(distinct r.user_id)*100/ (select count(*) from users),2) as percentage
from users u join register r on u.user_id = r.user_id
group by contest_id 
order by percentage desc , contest_id asc;

-- SELECT contest_id, round(count(distinct user_id )*100/ (select count(user_id) from Users),2) AS percentage
-- FROM Register  
-- GROUP BY contest_id ORDER BY percentage DESC , con