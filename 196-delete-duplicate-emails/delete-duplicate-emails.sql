# Write your MySQL query statement below
WITH DuplicateEmails AS (
    SELECT p1.id FROM Person p1 JOIN Person p2
ON p1.email = p2.email AND p1.id>p2.id)

DELETE FROM Person WHERE id in (SELECT id FROM DuplicateEmails)