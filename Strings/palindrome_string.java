package Strings;
import java.util.Scanner;
public class palindrome_string {
    public static void main(String args[]){
        boolean stat=true;
        System.out.println("Enter your String");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i <str.length()-1; i++) {
            for (int j = str.length()-1; j>0;) {
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("Palindrome");
                    stat=false;
                    break;}}}
                if(stat){
                    System.out.println("The given string is Palindrome");}
                else{
                    System.out.println("The given string is not a  Palindome");}}}
