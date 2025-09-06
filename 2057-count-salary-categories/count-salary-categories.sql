# Write your MySQL query statement below
SELECT 'Low Salary' AS category,
count(*) AS accounts_count
from accounts where income<20000

UNION ALL

SELECT 'Average Salary' AS category,
count(*) AS accounts_count
from accounts where income between 20000 and 50000

UNION ALL

SELECT 'High Salary' AS category, 
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income > 50000;