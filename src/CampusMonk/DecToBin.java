package CampusMonk;
import java.util.*;
public class DecToBin {
    public static void main(String[] args) {
        System.out.println("Enter the Decimal Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        int p=0;
        while(n >0){
            int r=n%2;
            b=b+r*(int)Math.pow(10,p);
            p++;
            n/=2;
        }
        System.out.println(b);
    }
}
