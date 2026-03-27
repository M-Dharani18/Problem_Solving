# Write your MySQL query statement below
select 
    LEFT(trans_date,7) as month , 
    country , 
    count(id) as trans_count,
    sum(if(state='approved',1,0))as approved_count,
    sum(amount) as trans_total_amount,
    sum(if(state='approved',amount,0)) as approved_total_amount
from transactions 
group by month,country;

-- SELECT LEFT(trans_date,7) as month , country , count(id) as trans_count , sum(state='approved') as approved_count, sum(amount) AS trans_total_amount,sum((state='approved')*amount) as approved_total_amount FROM transactions 
-- group by month,country;