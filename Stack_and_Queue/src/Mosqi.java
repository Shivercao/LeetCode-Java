import java.util.Scanner;

/**
 * Created by shivercao on 3/12/2018.
 */
public class Mosqi {

    public int numberOfMosq(int[] net, int[][] locationSet){
        int check = 0;
        for(int[] location : locationSet){
            int count = 0;
            for(int i = 0; i < location.length; i++){
                if(location[i] <= net[i] && location[i] > 0) count++;
            }
            if (count == 3) check++;
        }
        return check;
    }

    //parameterize the input numbers.
    public int getNumofMosquitos(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of Mosquitos");
        int num = input.nextInt();
        return num;
    }

    public int[] getNetSize(){
        int[] net = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("net size");
        String str1 = input.nextLine();
        String[] set = str1.split(" ");
        for(int i = 0; i < 3; i++){
            net[i] = Integer.parseInt(set[i]);
        }
        return net;
    }

    public int[][] getMosq_location (int number){
        int[][] locationSet = new int[number][3];
        Scanner input = new Scanner(System.in);
        System.out.println("mosq location: ex. 3 3 3");

        for(int i = 0; i < number; i++){
            String str = input.nextLine();
            String[] set = str.split(" ");
            for(int j = 0; j < 3; j++){
                locationSet[i][j] = Integer.parseInt(set[j]);
            }
        }
        return locationSet;
    }

    public static void main(String[] args) {
        Mosqi test = new Mosqi();
        int num = test.getNumofMosquitos();
        int[] net = test.getNetSize();
        int[][] locationSet = test.getMosq_location(num);
        System.out.println(test.numberOfMosq(net, locationSet));
    }
}
