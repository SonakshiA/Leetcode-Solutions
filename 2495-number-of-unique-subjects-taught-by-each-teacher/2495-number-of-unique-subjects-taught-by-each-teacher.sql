# Write your MySQL query statement 
select teacher_id, Count(distinct subject_id) AS cnt from Teacher group by teacher_id ;