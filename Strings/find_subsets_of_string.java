package Strings;

public class find_subsets_of_string {
    public static void main(String [] args) {
        String str= "abcd";
        for (int i = 0; i <str.length()-1; i++) {
            System.out.println(str.charAt(i));
            for (int j = i; j <str.length()-1; j++) {
                System.out.println(str.substring(j,j+1));
                for (int j2 = j; j2 <str.length()-1; j2++) {
                    System.out.println(str.substring(j2,j2+2));}}}
        System.out.println(str);        
        System.out.println("Total subsets="+(((str.length()*str.length())+(str.length()))/2)+1);        
        
        
    }
    
}
