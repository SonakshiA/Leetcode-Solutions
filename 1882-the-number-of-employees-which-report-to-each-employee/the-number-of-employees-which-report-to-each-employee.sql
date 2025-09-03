# Write your MySQL query statement below
select m.employee_id, m.name, count(*) AS reports_count, round(avg(e.age)) AS average_age
from employees as e join employees m
ON e.reports_to = m.employee_id GROUP BY (m.employee_id)
ORDER BY m.employee_id;