```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-array
@Language: Markdown
@Datetime: 17-06-02 13:21
```

要求：
给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
注意： 给定的是排序数组，排序好啦！！！
思路：
因为给定的数组的排序的，因此有元素重复出现，那么这个元素必然是相邻的（不然不符合排序数组要求）。
维护一个计数指针，用来记录当前非重复元素的个数。只要从左到右开始遍历，判断当前元素是否与最后一个非重复元素相同即可，若相同则继续遍历，不同则覆盖计数指针指向的当前元素，计数指针加一。
