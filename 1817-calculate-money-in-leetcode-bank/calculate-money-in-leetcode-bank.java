class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int days=n%7;

        int money=0;

        money = 28*weeks + 7*(weeks-1)*(weeks)/2;

        money += (days)*(days+1)/2 + days*weeks;

        return money;


    }
}