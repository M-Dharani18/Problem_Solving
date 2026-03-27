# Write your MySQL query statement below
select p.product_id, round(ifnull(sum(p.price*u.units)/ sum(u.units),0),2) as average_price
from prices p left join unitssold u 
on p.product_id = u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id;

-- SELECT Prices.product_id,round(IFNULL(sum(Prices.price*UnitsSold.units)/sum(UnitsSold.units),0),2) AS average_price 
-- FROM Prices 
-- LEFT JOIN UnitsSold ON Prices.product_id = UnitsSold.product_id
-- AND UnitsSold.purchase_date BETWEEN Prices.start_date AND Prices.end_date
-- GROUP BY Prices.product_id;