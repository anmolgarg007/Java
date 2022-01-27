package Series;

import java.util.Scanner;
// find the sum of the series

//s=a/2+a/5+a/8+a/11........a/n

public class series4 {
    public static void main(String args[]){
        double sum=0;
        System.out.println("Enter the value of a:");
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        for (int i = 2; i <=n; i=i+3) {
            sum=sum+(1*Math.pow(i, -1));
            
        }System.out.println("the sum of the sereis="+(a*sum));
    
}}
