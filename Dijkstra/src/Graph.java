/**
 * Created by shivercao on 10/15/2017.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Graph {

    public static int[][] getCpMatrix(int n) {
        int[][] cpMatrix = new int[n][n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    cpMatrix[i][j] = 0;
                    continue;
                }
                int cur = rd.nextInt(n)+1;
                cpMatrix[i][j] = cur;
                cpMatrix[j][i] = cur;
            }
        }
        return cpMatrix;
    }
    //sparse matrix
    public static int[][] getSpMatrix(int n) {
        int[][] spMatrix = new int[n][n];
        Random rd = new Random();
        for (int i = 1; i < n; i++) {
            int cur = rd.nextInt(n)+1;
            int j = rd.nextInt(i);
            spMatrix[i][j] = cur;
            spMatrix[j][i] = cur;
        }
        return spMatrix;
    }

    //generate node array
    public static Node[] getNodeList(int[][] matrix) {
        int n = matrix.length;
        Node[] nodeList = new Node[n];

        for (int i = 0; i < n; i++) {
            Node node = new Node(i+1);
            nodeList[i] = node;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    nodeList[i].neighbors.put(j+1, matrix[i][j]);
                }
            }
        }

        return nodeList;
    }

    public static int[] getOneDimArray(int[][] matrix){
        int length = matrix.length * (matrix.length-1) / 2;
        int[] array = new int[length];
        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                array[(i-1)*i/2 + j] = matrix[i][j];
            }
        }
        return array;
    }

}


class Node {
    int name;
    Map<Integer, Integer> neighbors; // name, weight

    public Node(int n) {
        this.name = n;
        this.neighbors = new HashMap<>();
    }
}
