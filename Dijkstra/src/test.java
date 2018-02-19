/**
 * Created by shivercao on 10/15/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long begin_time = System.currentTimeMillis(); //to measure time
        int[][] weight = Graph.getSpMatrix(10);//get random graph, CpMatrix is complete graph
        System.out.println(Arrays.deepToString(weight));
        //test case 1
        int[][] weight2 = {{0, 0, 0, 29, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 11, 11, 0}, {0, 0, 0, 12, 0, 5, 5, 0},{29, 0, 12, 0, 5, 0, 13,0},
                {0, 0, 0, 5, 0, 0, 7,11}, {0, 11, 5, 0, 0, 0, 0, 17}, {0, 11, 5, 13, 7, 0, 0, 0}, {0, 0, 0, 0, 11, 17, 0, 0}};
        //test case 2

        int[][] weight3 = {{0, 11, 14, 0, 8, 0, 29, 28, 0, 0, 14, 0},
                {11, 0, 12, 0, 6, 0, 0, 0, 0, 0, 0, 0},
                {14, 12, 0, 18, 13, 13, 0, 0, 25, 0, 0, 16},
                {0, 0, 18, 0, 0, 0, 27, 17, 9, 25, 0, 0},
                {8, 6, 13, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                {0, 0, 13, 0, 0, 0, 0, 15, 5, 0, 0, 0},
                {29, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0},
                {28, 0, 0, 17, 0, 15, 0, 0, 5, 9, 0, 0},
                {0, 0, 25, 9, 0, 5, 0, 5, 0, 0, 25, 0},
                {0, 0, 0, 25, 0, 0, 0, 9, 0, 0, 0, 0},
                {14, 0, 0, 0, 0, 0, 0, 0, 25, 0, 0, 0},
                {0, 0, 16, 0, 22, 0, 0, 0, 0, 0, 0, 0} };


        Floyd2Array.ftd(weight2, 6, 7);
        //Dijkstra2array.dta(weight3, weight3.length, 1, 7);
        //int[] graph = Graph.getOneDimArray(weight3);//for one dimension array

        //FloydOneDAarry.fod(graph, weight3.length, 11, 9);
        //Dijkstra1DArray.doa(graph, weight3.length, 1, 7);

        //Node[] nodelist = Graph.getNodeList(weight3);//for linkedlist

        //FloydLinkedList.fll(nodelist, weight3.length, 6, 7);
        //DijkstraLinkedList.dll(nodelist, weight3.length, 6, 7);

        long end_time = System.currentTimeMillis();//to measure time
        long freeMemory = rt.freeMemory();
        long totalMemory=rt.totalMemory();
        System.out.println("Time usage is: " + (end_time - begin_time));
        System.out.println("the memory:"+(totalMemory-freeMemory) + " byte");

    }

}
