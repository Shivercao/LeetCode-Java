/**
 * Created by shivercao on 3/12/2018.
 */
public class Homework {
    public static int money(int m, int x, int k, int[] events){
        int salary = 0;
        boolean waiver = false;
        for(int event : events){
            if(event == 0){
                salary += m - x;
                waiver = true;
            }else if(event == 1 && waiver){
                salary += m;
                waiver = false;
            }else if(event == 1 && !waiver){
                salary += m - k;
            }
        }
        return salary;
    }

}
