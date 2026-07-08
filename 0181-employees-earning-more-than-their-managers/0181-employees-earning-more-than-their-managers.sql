# Write your MySQL query statement below
select emp.name as Employee from employee emp join employee mgr on emp.managerId = mgr.id where emp.salary > mgr.salary;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna