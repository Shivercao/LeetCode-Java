/**
 * Created by shivercao on 10/13/2017.
 */
public class Dijkstra2array {
    public static void dta(int[][] weight, int n, int start, int end){
        int[] path = new int[weight.length];
        int[] dist = new int [weight.length];
        boolean[] included = new boolean[weight.length];
        int src = start;
        for(int i = 0; i < weight.length; i++){
            path[i] = src;
            dist[i] = Integer.MAX_VALUE;
            included[i] = false;
        }
        dist[src] = 0;
        int min = 0;
        int nearest = -1;
        for(int i = 0; i < weight.length-1; i++){
            min = Integer.MAX_VALUE;
            for(int j = 0; j < weight.length; j++){
                if(included[j] == false && dist[j] < min){
                    min = dist[j];
                    nearest = j;
                }
            }
            included[nearest] = true;
            for(int k = 0; k < weight.length; k++){
                if(included[k] == false){
                    if(weight[nearest][k] != 0 && dist[nearest] != Integer.MAX_VALUE && dist[k] > dist[nearest] + weight[nearest][k]){
                        dist[k] = dist[nearest] + weight[nearest][k];
                        path[k] = nearest;
                    }
                }
            }
        }
        printDijPath(dist, n);
        printOutput(path, start, end);
        System.out.println("Weight: " + dist[end]);
    }

    public static void printDijPath(int dist[], int k){
        System.out.println("Vertex   Distance from source");
        for(int i = 0; i < k; i++){
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void printOutput(int path[], int start, int end){
        String output = "";
        output = output + " -> v" + (end+1);
        int temp = path[end];
        while(temp != start){
            output = " -> v" + (temp+1) + output;
            temp = path[temp];
        }
        output = "v" + (start+1) + output;
        System.out.println(output);


