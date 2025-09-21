class Solution {
    public int fib(int n) {
        int first=0,second=1,next;
        for(int term=0;term<n;term++)
        {
            next=first+second;
            first=second;
            second=next;
        }
        return first;
    }
}