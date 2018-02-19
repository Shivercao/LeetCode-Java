/**
 * Created by shivercao on 10/16/2017.
 */
public class Dijkstra1DArray {
    public static void doa(int[] weight, int n, int start, int end) {
        int[] path = new int[n];
        int[] dist = new int[n];
        boolean[] included = new boolean[n];
        int src = start;
        for (int i = 0; i < n; i++) {
            path[i] = src;
            dist[i] = Integer.MAX_VALUE;
            included[i] = false;
        }
        dist[src] = 0;
        int min = 0;
        int nearest = -1;
        for (int i = 0; i < n - 1; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (included[j] == false && dist[j] < min) {
                    min = dist[j];
                    nearest = j;
                }
            }
            included[nearest] = true;
            for (int k = 0; k < n; k++) {
                if (included[k] == false) {
                    int map = 0;
                    if (nearest > k) map = (nearest - 1) * nearest / 2 + k;
                    else map = (k - 1) * k / 2 + nearest;

                    if (weight[map] != 0 && dist[nearest] != Integer.MAX_VALUE && dist[k] > dist[nearest] + weight[map]) {
                        dist[k] = dist[nearest] + weight[map];
                        path[k] = nearest;
                    }
                }
            }
        }
        printDijPath(dist, n);
        printOutput(path, start, end);
        System.out.println("Weight: " + dist[end]);
    }

    public static void printDijPath(int dist[], int k) {
        System.out.println("Vertex   Distance from source");
        for (int i = 0; i < k; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void printOutput(int path[], int start, int end) {
        String output = "";
        output = output + " -> v" + (end + 1);
        int temp = path[end];
        while (temp != start) {
            output = " -> v" + (temp + 1) + output;
            temp = path[temp];
        }
        output = "v" + (start + 1) + output;
        System.out.println(output);
    }
}
