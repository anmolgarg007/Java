package Series;
import java.math.*;
import java.util.Scanner;

public class series2 {
    //find the sum of the series
    //s=a+a*2+a*3+a*4.........a*n;
    public static void main(String args[]){
        int num,n;
        double sum=0;
        System.out.println("Enter the value of a:");
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        n=sc1.nextInt();
        for (int i =1; i <=n; i++) {
            sum=Math.pow(num, i)+sum;
            
        }System.out.println("The sum of the sereis is "+sum);

    }
}
