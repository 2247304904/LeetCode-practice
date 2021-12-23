
drop table if exists user_profile;
CREATE TABLE `user_profile` (
                                `id` int NOT NULL,
                                `device_id` int NOT NULL,
                                `gender` varchar(14) NOT NULL,
                                `age` int ,
                                `university` varchar(32) NOT NULL,
                                `gpa` float);
INSERT INTO user_profile VALUES(1,2234,'male',21,'北京大学',3.2);
INSERT INTO user_profile VALUES(2,2235,'male',null,'复旦大学',3.8);
INSERT INTO user_profile VALUES(3,2236,'female',20,'复旦大学',3.5);
INSERT INTO user_profile VALUES(4,2237,'female',23,'浙江大学',3.3);
INSERT INTO user_profile VALUES(5,2238,'male',25,'复旦大学',3.1);
INSERT INTO user_profile VALUES(6,2239,'male',25,'北京大学',3.6);
INSERT INTO user_profile VALUES(7,2240,'male',null,'清华大学',3.3);
INSERT INTO user_profile VALUES(8,2241,'female',null,'北京大学',3.7);

INSERT INTO user_profile VALUES(1,3234,'male',21,'复旦大学',3.7);
INSERT INTO user_profile VALUES(2,3235,'male',null,'复旦大学',3.3);
INSERT INTO user_profile VALUES(3,3236,'female',20,'北京大学',3.6);
INSERT INTO user_profile VALUES(4,3237,'female',23,'浙江大学',3.2);
INSERT INTO user_profile VALUES(5,3238,'male',25,'复旦大学',3.5);
INSERT INTO user_profile VALUES(6,3239,'male',25,'中山大学',3.8);
INSERT INTO user_profile VALUES(7,3240,'male',null,'清华大学',4.0);
INSERT INTO user_profile VALUES(8,3241,'female',null,'北京航空航天大学',3.5);


-- 查找gpa最高的成绩
select MAX(gpa) as gpa from user_profile



drop table if exists user_profile;
CREATE TABLE `user_profile` (
                                `id` int NOT NULL,
                                `device_id` int NOT NULL,
                                `gender` varchar(14) NOT NULL,
                                `age` int ,
                                `university` varchar(32) NOT NULL,
                                `gpa` float);
INSERT INTO user_profile VALUES(1,2138,'male',21,'北京大学',3.4);
INSERT INTO user_profile VALUES(2,3214,'male',null,'复旦大学',4.0);
INSERT INTO user_profile VALUES(3,6543,'female',20,'北京大学',3.2);
INSERT INTO user_profile VALUES(4,2315,'female',23,'浙江大学',3.6);
INSERT INTO user_profile VALUES(5,5432,'male',25,'山东大学',3.8);
INSERT INTO user_profile VALUES(6,2131,'male',28,'北京师范大学',3.3);


-- SQL17 计算男生人数以及平均GPA
# 要求GPA保留一位小数 使用ROUND函数
SELECT
    count(1) as male_num,
    ROUND(AVG(gpa),1)as avg_gpa
FROM user_profile
WHERE gender = 'male'

-- SQL18 分组计算练习题
-- https://www.nowcoder.com/practice/009d8067d2df47fea429afe2e7b9de45?tpId=199&tags=&title=&difficulty=0&judgeStatus=0&rp=0

drop table if exists user_profile;
CREATE TABLE `user_profile` (
                                `id` int NOT NULL,
                                `device_id` int NOT NULL,
                                `gender` varchar(14) NOT NULL,
                                `age` int ,
                                `university` varchar(32) NOT NULL,
                                `gpa` float,
                                `active_days_within_30` float,
                                `question_cnt` float,
                                `answer_cnt` float
);
INSERT INTO user_profile VALUES(1,2138,'male',21,'北京大学',3.4,7,2,12);
INSERT INTO user_profile VALUES(2,3214,'male',null,'复旦大学',4.0,15,5,25);
INSERT INTO user_profile VALUES(3,6543,'female',20,'北京大学',3.2,12,3,30);
INSERT INTO user_profile VALUES(4,2315,'female',23,'浙江大学',3.6,5,1,2);
INSERT INTO user_profile VALUES(5,5432,'male',25,'山东大学',3.8,20,15,70);
INSERT INTO user_profile VALUES(6,2131,'male',28,'山东大学',3.3,15,7,13);
INSERT INTO user_profile VALUES(7,4321,'male',28,'复旦大学',3.6,9,6,52);

SELECT
    gender,
    university,
    count(gender) as user_num,
    ROUND(AVG(active_days_within_30),1)as avg_active_day,
    ROUND(AVG(question_cnt),1)as avg_question_cnt
from
    user_profile
GROUP BY
    gender, university


# SQL19 分组过滤练习题
# https://www.nowcoder.com/practice/ddbcedcd9600403296038ee44a172f2d?tpId=199&tags=&title=&difficulty=0&judgeStatus=0&rp=0
SELECT
    university,
    AVG(question_cnt) as avg_question_cnt,
    AVG(answer_cnt) as avg_answer_cnt
from
    user_profile
GROUP BY university
HAVING avg_question_cnt<5
    or avg_answer_cnt <20


# SQL20 分组排序练习题
SELECT
    university,
    AVG(question_cnt) as avg_question_cnt
from
    user_profile
GROUP BY university
ORDER BY avg_question_cnt



drop table if exists `user_profile`;
drop table if  exists `question_practice_detail`;
CREATE TABLE `user_profile` (
                                `id` int NOT NULL,
                                `device_id` int NOT NULL,
                                `gender` varchar(14) NOT NULL,
                                `age` int ,
                                `university` varchar(32) NOT NULL,
                                `gpa` float,
                                `active_days_within_30` int ,
                                `question_cnt` int ,
                                `answer_cnt` int
);
CREATE TABLE `question_practice_detail` (
                                            `id` int NOT NULL,
                                            `device_id` int NOT NULL,
                                            `question_id`int NOT NULL,
                                            `result` varchar(32) NOT NULL
);
INSERT INTO user_profile VALUES(1,2138,'male',21,'北京大学',3.4,7,2,12);
INSERT INTO user_profile VALUES(2,3214,'male',null,'复旦大学',4.0,15,5,25);
INSERT INTO user_profile VALUES(3,6543,'female',20,'北京大学',3.2,12,3,30);
INSERT INTO user_profile VALUES(4,2315,'female',23,'浙江大学',3.6,5,1,2);
INSERT INTO user_profile VALUES(5,5432,'male',25,'山东大学',3.8,20,15,70);
INSERT INTO user_profile VALUES(6,2131,'male',28,'山东大学',3.3,15,7,13);
INSERT INTO user_profile VALUES(7,4321,'male',28,'复旦大学',3.6,9,6,52);
INSERT INTO question_practice_detail VALUES(1,2138,111,'wrong');
INSERT INTO question_practice_detail VALUES(2,3214,112,'wrong');
INSERT INTO question_practice_detail VALUES(3,3214,113,'wrong');
INSERT INTO question_practice_detail VALUES(4,6543,111,'right');
INSERT INTO question_practice_detail VALUES(5,2315,115,'right');
INSERT INTO question_practice_detail VALUES(6,2315,116,'right');
INSERT INTO question_practice_detail VALUES(7,2315,117,'wrong');
INSERT INTO question_practice_detail VALUES(8,5432,118,'wrong');
INSERT INTO question_practice_detail VALUES(9,5432,112,'wrong');
INSERT INTO question_practice_detail VALUES(10,2131,114,'right');
INSERT INTO question_practice_detail VALUES(11,5432,113,'wrong');

SELECT * FROM user_profile

# SQL21 浙江大学用户题目回答情况

SELECT
    u.device_id,
    d.question_id,
    d.result

from user_profile u,
     question_practice_detail d
where
        u.device_id = d.device_id
  and u.university='浙江大学'





