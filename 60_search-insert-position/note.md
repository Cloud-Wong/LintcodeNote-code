```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/search-insert-position
@Language: Markdown
@Datetime: 17-06-06 09:34
```

要求：
给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置
思路：
方式一：
顺序查找
若检索到target 或大于target直接返回下标
若无，则返回数组长度
方式二：
二分查找
利用二分法查找target
若无结果则返回start