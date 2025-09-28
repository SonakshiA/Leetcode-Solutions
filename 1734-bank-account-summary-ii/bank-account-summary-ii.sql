# Write your MySQL query statement below
SELECT name, SUM(amount) AS balance FROM transactions JOIN users ON
users.account = transactions.account
GROUP BY transactions.account
HAVING SUM(amount) >10000