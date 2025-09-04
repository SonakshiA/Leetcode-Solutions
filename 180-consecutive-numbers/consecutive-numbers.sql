# Write your MySQL query statement below
select DISTINCT l1.num as ConsecutiveNums from Logs l1
JOIN Logs l2 ON l1.id=l2.id-1
JOIN Logs l3 on l2.id=l3.id-1
where l1.num = l2.num and l2.num=l3.num;