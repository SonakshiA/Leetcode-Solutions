# Write your MySQL query statement below
Select product_id, new_price AS price FROM products
where (product_id, change_date) IN (
    Select product_id, MAX(change_date)
    FROM products
    where change_date <= '2019-08-16'
    GROUP BY product_id
)

UNION

Select product_id, 10 AS price from Products
where product_id NOT IN
(
    select product_id from products
    where change_date <= '2019-08-16'
);
