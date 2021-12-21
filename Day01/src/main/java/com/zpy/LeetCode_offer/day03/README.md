# Day 03 Offer 09. 用两个栈实现队列

有两个栈1.操作栈 2.辅助栈
appendTail与之前一样直接push到操作栈就可以
deleteHead利用辅助栈读出操作栈的数据 此时是逆序 这个时候pop辅助栈的值 之后再pop到操作栈中




# 剑指 Offer 30. 包含min函数的栈

根据题目要求 需要实现 调用min push pop的时间复杂度都是O(1)；

根据Stack类 其push和pop已经是时间复杂度为O（1）的

top -》Stack中的peek（）

操作栈中进行pop和push

辅助栈中严格记录 降序排列

min的时候 辅助栈peek就可以

pop的时候也需要判断 操作栈和辅助栈中栈顶的是不是一个值

是一个值的时候需要同时pop