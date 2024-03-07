package nov162023;

public class MaximizeProfit {
	
	
public static void main(String[] args) {
	int prices[] = {1, 1, 5, 3, 3, 0,2};
	//int[] result=findMaxProfit(prices);
	//System.out.println(result[2]-result[0]);
	int result1=maxProfit(prices);
	System.out.println(result1);
}

private static int[] findMaxProfit(int[] prices) {
	// TODO Auto-generated method stub
	int []arr=new int[3];
	int buyprice=prices[0];
	int sellprice=0;
	int i=1;
	int index=0;
	while(i<prices.length)  {
		if(buyprice>prices[i]) {
			buyprice=prices[i];
			index=i;
		}	
		i++;
	}
	int newindex=index;
	while(newindex<prices.length) {
		if(sellprice<prices[newindex]) {
			sellprice=prices[newindex];
		}
		newindex++;
	}
	
	arr[0]=buyprice;
	arr[1]=index;
	arr[2]=sellprice;
	return arr;
}
static int maxProfit(int prices[]) {
int buy = prices[0], max_profit = 0;
//int prices[] = {1, 1, 5, 3, 3, 0};
for (int i = 1; i < prices.length; i++) {

    // Checking for lower buy value
    if (buy > prices[i])
        buy = prices[i];

    // Checking for higher profit
    else if (prices[i] - buy > max_profit)
        max_profit = prices[i] - buy;
}
return max_profit;
}
}
