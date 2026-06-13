class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        m = len(s)
        tab = [[0]*m for _ in range(m)]

        srt = 0
        maxl = 1

        for i in range(m):
            tab[i][i] = 1

        for i in range(m-1):
            if s[i] == s[i+1]:
                tab[i][i+1] = 1
                srt, maxl = i, 2

        for l in range(3, m+1):
            for i in range(m-l+1):
                j = i + l - 1

                if s[i] == s[j] and tab[i+1][j-1]:
                    tab[i][j] = 1
                    srt, maxl = i, l

        return s[srt:srt+maxl]
        