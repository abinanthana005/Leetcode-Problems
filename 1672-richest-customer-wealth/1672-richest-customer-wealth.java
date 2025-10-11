class Solution {
    public int maximumWealth(int[][] accounts) {
        int norows=accounts.length;
        int nocols=accounts[0].length;
        int sum,max=0;
        for(int row=0;row<norows;row++)
        {
            sum=0;
             for(int col=0;col<nocols;col++)
             {
                sum=sum+accounts[row][col];
             }
             if(sum>max)
        max=sum;
        }
        return max;
    }
}