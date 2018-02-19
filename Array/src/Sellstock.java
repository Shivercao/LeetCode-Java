import java.util.Arrays;
import java.util.List;

/**
 * Created by shivercao on 1/25/2018.
 * Sell stock at the biggest profit
 */

public class Sellstock {
    public double solution(List<Double> prices){
        if (prices == null || prices.size() == 0){
            return 0;
        }
        //array = {320, 310, 310, 325, 350, 290}
        //minValue = {320, 310, 310, 310 ,310, 290}
        //maxProfit = {0, 0, 0 , 15, 40, 0}

        double minValue = Double.MAX_VALUE;
        double maxProfit = 0;
        for (Double price : prices){
            minValue = Math.min(price, minValue);
            maxProfit = Math.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        Sellstock sample = new Sellstock();
        List<Double> prices = Arrays.asList(320.0, 310.0, 310.0, 325.0, 350.0, 290.0);

        System.out.println(sample.solution(prices));

    }
}
