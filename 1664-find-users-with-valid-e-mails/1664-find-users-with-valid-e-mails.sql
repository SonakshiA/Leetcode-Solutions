# Write your MySQL query statement below
SELECT * FROM users where REGEXP_LIKE(mail,
'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$','c');