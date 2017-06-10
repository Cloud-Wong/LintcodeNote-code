```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Markdown
@Datetime: 17-06-10 13:36
```

要求：
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
思路：
一个简单的栈的应用
若遇到“( [ { ”则入栈，若遇到匹配的") ] }"则出栈。
若遍历过程中栈空或括号不匹配出栈失败，则返回false
成功遍历结束后返回true

