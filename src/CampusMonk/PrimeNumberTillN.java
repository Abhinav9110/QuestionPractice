package CampusMonk;
import java.util.*;
public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n=sc.nextInt();
        int cout =0;
        for(int i=2;i<n;i++){
            if(i==2){
                System.out.println(i);
                cout++;
            }
            if(i%2!=0){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println("Total Number of Prime number is: "+cout);
    }
}
