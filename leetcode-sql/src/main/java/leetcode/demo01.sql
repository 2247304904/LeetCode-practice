-- https://leetcode.cn/problems/big-countries/?plan=sql&plan_progress=zxbs8ch
-- 595. 大的国家
select name, population, area
from World
where population >= 25000000
   or area > 3000000;

--  Write your MySQL query statement below
--  方法一：使用 WHERE 子句和 OR
--  select t.name, t.population, t.area from world t
--          where t.area >= 3000000 or t.population >= 25000000
--
--            方法二：使用 WHERE 子句和 UNION
--    使用 or 会使索引会失效，在数据量较大的时候查找效率较低，通常建议使用 union 代替 or
select t.name, t.population, t.area
from world t
where t.area >= 3000000
union
select t.name, t.population, t.area
from world t
where t.population >= 25000000



--     1757. 可回收且低脂的产品
--     https://leetcode.cn/problems/recyclable-and-low-fat-products/?plan=sql&plan_progress=zxbs8ch
select product_id
from Products
where low_fats = 'Y'
  and recyclable = 'Y'


--
--     https://leetcode.cn/problems/find-customer-referee/?plan=sql&plan_progress=zxbs8ch
--     584. 寻找用户推荐人
select name
from customer
where referee_id != 2
union
select name
from customer
where referee_id is null

union代替 or

select name from customer
where id not in (select id from customer where referee_id=2)

--     https://leetcode.cn/problems/customers-who-never-order/?plan=sql&plan_progress=zxbs8ch
--     183. 从不订购的客户
select customers.name as 'Customers'
from customers
where customers.id not in
      (
          select customerid from orders
      );