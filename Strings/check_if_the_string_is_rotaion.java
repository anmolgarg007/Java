package Strings;
import java.util.Scanner;
//if str1=ABCD then rotation=BADC
public class check_if_the_string_is_rotaion {
    public static void main(String args[]){
        boolean flag=false;
        System.out.println("Enter your 1st String");
        Scanner sc1=new Scanner(System.in);
        String str1=sc1.nextLine();
        System.out.println("Enter your 2nd String");
        Scanner sc2=new Scanner(System.in);
        String str2=sc2.nextLine();
        for (int i = 0; i <str1.length()-1; i++) {
            for (int j = 0; j < str2.length()-1; j++) {
                if(str1.charAt(i)==str2.charAt(j+1)){
                    flag=true;
                    break;}}}
                if(flag){
                    System.out.println("The two strings are rotation of the each other");}
                    else{
                        System.out.println("The two strings are not the rotation of each other");
                    }    
}}
