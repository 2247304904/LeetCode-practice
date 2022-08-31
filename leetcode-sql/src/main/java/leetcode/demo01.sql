-- https://leetcode.cn/problems/big-countries/?plan=sql&plan_progress=zxbs8ch
-- 595. 大的国家
select name,population,area from World where population >= 25000000 or area > 3000000 ;

--  Write your MySQL query statement below
--  方法一：使用 WHERE 子句和 OR
--  select t.name, t.population, t.area from world t
--          where t.area >= 3000000 or t.population >= 25000000
--
--            方法二：使用 WHERE 子句和 UNION
--    使用 or 会使索引会失效，在数据量较大的时候查找效率较低，通常建议使用 union 代替 or
select t.name, t.population, t.area from world t
where t.area >= 3000000
union
select t.name, t.population, t.area from world t
where t.population >= 25000000
