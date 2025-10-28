package CampusMonk;
import java.util.*;
public class BinToDec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number:");
        int n=sc.nextInt();
        int pow=0;
        int num=0;
        while(n >0){
            int l=n%10;
            num=num+l*(int)Math.pow(2,pow);
            pow++;
            n/=10;
        }
        System.out.println(num);
    }

}

