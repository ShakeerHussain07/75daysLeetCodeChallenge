class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        def fib(n):
            op[0]=1
            op[1]=1
            if op[n]!=-1:
                return op[n]
            op[n]=fib(n-1)+fib(n-2)
            return op[n]
        op=[-1]*(n+1)
        return fib(n)
        