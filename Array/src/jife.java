import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivercao on 2/7/2018.
 */
class A {
    int a = 5,b = 7;
    int c = a+=2*3+b--;

    public static void main(String[] args) {
        int a = 5,b = 7;
        int c = a+=2*3+b--;
        System.out.println(c);
    }
}