# Write your MySQL query statement below
select s.user_id as user_id, round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate 
from signups as s LEFT JOIN confirmations
as c on s.user_id = c.user_id GROUP BY user_id;