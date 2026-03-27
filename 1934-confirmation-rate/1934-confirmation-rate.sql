# Write your MySQL query statement below
select s.user_id, round(avg(if(action='Confirmed',1.00,0)),2) as confirmation_rate
from signups s left join Confirmations c on s.user_id = c.user_id 
group by s.user_id;

-- SELECT Signups.user_id ,round(avg(IF(Confirmations.action = 'Confirmed',1.00,0)),2) AS confirmation_rate
-- FROM Signups LEFT JOIN Confirmations ON Signups.user_id = Confirmations.user_id 
-- GROUP BY Signups.user_id;