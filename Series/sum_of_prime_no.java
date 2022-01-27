package Series;
import java.lang.reflect.Array;
import java.util.Scanner;
public class sum_of_prime_no {
    public static void main(String args[]){
        int count,sum=0,num;
        System.out.println("Enter the last limit upto which u want the prime no.");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
              count = 0;
              for (int j = 2; j <= i / 2; j++) {
               if (i % j == 0) {
                count++;
                break;}}
           
              if (count == 0) {
                  sum=sum+i;
               System.out.print(","+i);
              }}
              System.out.println("\nThe sum of the series ="+sum);
            }
           }