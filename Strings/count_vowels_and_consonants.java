package Strings;
import java.util.Scanner;
public class count_vowels_and_consonants {
    public static void main(String [] args){
        int count1=0,count2=0,length1;
        char spaces=' ';
        System.out.println("Enter the string");
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                count1++;

            }if(str.charAt(i)==spaces){
                count2++;

            }}
            length1=str.length()-count2;
            
        System.out.println("The no. of vowels in the string="+count1);
        System.out.println("The no. of consonants in the string="+(length1-count1));



    }
    
}
