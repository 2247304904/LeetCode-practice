# Day 03 Offer 09. 用两个栈实现队列

```java
有两个栈1.操作栈 2.辅助栈
appendTail与之前一样直接push到操作栈就可以
deleteHead利用辅助栈读出操作栈的数据 此时是逆序 这个时候pop辅助栈的值 之后再pop到操作栈中

```