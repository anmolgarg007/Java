package Series;

import java.util.Scanner;
//find the sum of the series
//s=a+(a+1)+(a+2)+(a+3)........(a+n)

public class series3 {
    public static void main(String args[]) {
        int sum1=0,sum2=0;
        System.out.println("Enter the value of a:");
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        sum1=num*n;
        for (int i = 1; i <=n-1; i++) {
            sum2=sum2+i;
            
        }
        System.out.println("The sum of the series= "+(sum1+sum2));
        
        
    }
    
}
