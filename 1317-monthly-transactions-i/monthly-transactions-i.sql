# Write your MySQL query statement below
SELECT LEFT(trans_date,7) AS month,
country,
count(trans_date) as trans_count,
SUM(state='approved') as approved_count,
SUM(amount) as trans_total_amount,
SUM((state='approved')*amount) AS approved_total_amount
FROM transactions
GROUP by month,country;