# Write your MySQL query statement below
WITH base AS (SELECT requester_id FROM RequestAccepted
UNION ALL
SELECT accepter_id FROM RequestAccepted) 
SELECT requester_id AS id, count(*) AS num FROM base GROUP BY requester_id
ORDER BY num DESC
LIMIT 1;

