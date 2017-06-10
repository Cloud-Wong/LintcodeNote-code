```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/unique-paths
@Language: Markdown
@Datetime: 17-06-01 01:30
```


方式一：
采用自顶向下的方式
要求出终点有几条路径，则须先求出终点前一步的路径数
求终点前一步的路径数又要去求终点前两步的路径数
。。。
直到求出第一步的路径数，再递归回去求终点的路径数

缺点：
时间效率低，其原因在于重复计算。

递归法（超时）
public int uniquePaths(int m, int n) {
        // write your code here 
        return path(1,1,m,n);
    }
    
    public int path(int x,int y,int m,int n){
        if(x==m||y==n) return 1;
        return path(x+1,y,m,n)+path(x,y+1,m,n);
    }
}

方式二（动态规划）：
采用自底向上的方式
把每一个点当前的路径数计作当前的一个状态，也称为局部解
用递推法计算状态转移方程：
由于机器人只能向下和向右走，因此每个点的状态都可以用上一步的路径数得到。
即   dp[i][j]=dp[i][j-1]+dp[i-1][j];
这样就可以依次从第一步到最后一步求出每一个状态
返回终点的状态即可




	