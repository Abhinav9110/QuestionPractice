package CampusMonk;
import java.util.*;
public class DivisorOfNumber {
        public static List<Integer> findDivisors(int n) {
            List<Integer> divisors = new ArrayList<>();
            // Loop from 1 up to n
            for (int i = 1; i <= n; i++) {
                // Check if i divides n completely
                if (n % i == 0) {
                    divisors.add(i);
                }
            }
            return divisors;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int n=sc.nextInt();
        System.out.println(findDivisors(n));
//        int []a=new int[n];
//        int j=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                a[j]=i;
//                j++;
//            }
//        }
//        System.out.println("The Divisor of number "+n+"is : ");
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
    }
}
