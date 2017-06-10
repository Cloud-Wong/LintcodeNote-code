```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/unique-characters
@Language: Markdown
@Datetime: 17-05-31 15:17
```

要求：
实现一个算法确定字符串中的字符是否均唯一出现
思路：
1.把给定的字符串转换成字符数组
2.把字符的ASCII码值作为整数数组的下标
3.每出现一次，下标对应整数数组的值加一
4.当出现整数数组为2时，说明出现重复元素，返回false
5.遍历结束，无重复元素，返回true