package CampusMonk;
import java.util.*;

public class GCD {
    public static int gcd(int a, int b) {

        int gcd=1;
        int x=Math.min(a,b);
        for(int i=1;i<=x;i++){
            if(a % i ==0 && b % i ==0){
                gcd=i;
            }
        }
        return gcd;

    }

    public static void main(String[] args) {
        System.out.println("GCD of Number is :"+gcd(5,8));
    }



}
