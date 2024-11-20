class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int open=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            count =Math.max(open,count);
            if(s.charAt(i)==')')
            {
                open--;
            }

        }
        return count;
    }
}