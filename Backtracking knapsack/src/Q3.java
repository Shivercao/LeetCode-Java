/**
 * Created by shivercao on 11/13/2017.
 */
public class Q3 {
    int n = 5;
    int capacity =9;
    int[] weight = {2,5,7,3,1};
    double[] value = {20,30,35,12,3};
    int maxValue = 0;
    int tempValue;
    int tempWeight;
    int[] way = new int[n];
    int[] bestWay = new int[n];
    public void BackTrack(int t){
        //search the root point
        if(t>n-1){
            if(tempValue > maxValue){
                maxValue = tempValue;
                for(int i=0;i<n;i++)
                    bestWay[i] = way[i];
            }
            return;
        }
        //search the left
        if(tempWeight + weight[t] <= capacity){
            tempWeight += weight[t];
            tempValue += value[t];
            way[t] = 1;
            BackTrack(t+1);
            tempWeight -= weight[t];
            tempValue -= value[t];
            way[t] = 0;
        }
        //directly search the right rather than put the item in
        if( Bound(t+1) >= maxValue){
            BackTrack(t+1);
        }
    }
    //calulate the uperbound of the max value of remaining goods
    public double Bound(int k){
        double maxLeft = tempValue;
        int leftWeight = capacity - tempWeight;
        while(k <= n-1 && leftWeight > weight[k] ){
            leftWeight -= weight[k];
            maxLeft += value[k];
            k++;
        }
        if( k <= n-1){
            maxLeft += value[k]/weight[k]*leftWeight;
        }
        return maxLeft;
    }
    public static void main(String[] args){
        Q3 b = new Q3();
        b.BackTrack(0);
        System.out.println("max value:"+b.maxValue);
        System.out.println("method:");
        for(int i : b.bestWay)
            System.out.print(i+"  ");
    }
}
