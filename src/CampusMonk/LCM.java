package CampusMonk;
import java.util.*;
public class LCM {
    public static int LCM(int a, int b) {
        int y=Math.max(a,b);
        for(int i=y;;i++){
            if(i%a ==0 && i%b==0){
                return i;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(LCM(2,4));
    }
}
