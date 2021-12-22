# 627. 变更性别
# https://leetcode-cn.com/problems/swap-salary/


# 方法：使用 UPDATE 和 CASE...WHEN
#
# 要想动态地将值设置成列，
# 我们可以在使用 CASE...WHEN... 流程控制语句的同时使用 UPDATE 语句


UPDATE salary
SET
    sex = CASE sex
              WHEN 'm' THEN 'f'
              ELSE 'm'
        END;

