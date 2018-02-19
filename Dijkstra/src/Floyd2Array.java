/**
 * Created by shivercao on 10/16/2017.
 */
public class Floyd2Array {
    public static void ftd(int[][] weight, int start, int end){
        int[][] dp = new int[weight.length][weight.length];
        int[][] path = new int[weight.length][weight.length];

        for(int i = 0; i < weight.length; i++){
            for(int j = 0; j < weight.length; j++){
                dp[i][j] = weight[i][j];
                path[i][j] = -1;
            }
        }
        for(int k = 0; k < weight.length; k++){
            for(int i = 0; i < weight.length; i++){
                for(int j = 0; j < weight.length; j++){
                    if(i == j){
                        dp[i][j] = 0;
                        continue;
                    }
                    if(dp[i][k] != 0 && dp[k][j] != 0 && (dp[i][k] + dp[k][j] < dp[i][j] || dp[i][j] == 0)){
                        dp[i][j] = dp[i][k] + dp[k][j];
                        path[i][j] = k;
                    }
                }
            }
        }
        System.out.print("v" + (start+1) + " -> ");
        printFloTwoPath(start,end,path);
        System.out.println("v" + (end+1));
        System.out.println("Weight: " + dp[start][end]);
    }

    public static void printFloTwoPath(int q, int r, int[][] path){
        if(path[q][r] != -1){
            printFloTwoPath(q, path[q][r], path);
            System.out.print("v" + (path[q][r]+1) + " -> ");
            printFloTwoPath(path[q][r], r, path);
        }
    }

    public static void printFloOnePath(int i, int j, int[] path){
        int map = 0;
        if(i > j) map = (i-1)*i/2 + j;
        else map = (j-1)*j/2 + i;
        if(path[map] != -1){
            printFloOnePath(i, path[map], path);
            System.out.print("v" + (path[map]+1));
            printFloOnePath(path[map], j, path);
        }
    }
}
