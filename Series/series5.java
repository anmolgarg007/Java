package Series;
import java.util.Scanner;

public class series5 {
    // find the sum of the sseries
    //s=2/a+3/a^2+4/a^3.....n
    public static void main(String[] args) {
        int a,n;
        double sum=0;
        System.out.println("Enter the value of a");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the value of n");
        Scanner sc1=new Scanner(System.in);
        n=sc1.nextInt();
        for (int i = 2; i <=n+1; i++) {
            for (int j = 1; j <=n; j++) {
                
            
                sum=sum+(i/Math.pow(a, j));

            
        }}
        System.out.println("The sum of the series = "+sum);

        
    }
    
}
