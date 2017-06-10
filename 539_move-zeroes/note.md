```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/move-zeroes
@Language: Markdown
@Datetime: 17-05-30 14:33
```

要求：
给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
思路：
要求数组中非零的元素保持原顺序排在数组的前面，那就在数组左侧设置一个遍历指针，从左到右开始遍历。
遇到第一个非零的元素，就把它放在数组的第一位。
遇到第二个非零的元素，就把它放在数组的第二位。
。。。
直到将所有的非零元素都放在数组左边，剩下的元素都为0。


