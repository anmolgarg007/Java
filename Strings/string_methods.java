package Strings;

public class string_methods {
    public static void main(String args[]){
       // String str="Anmol";
       String str=new String("Anmol");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2=new String("I am a good boy");
        int count=0;
        int count1=0;
        char ch=' ';
        String ch1="  ";
        for (int i = 0; i <str2.length(); i++) {
            if(ch==str2.charAt(i)){ //number of sapces
                count++;
            }
            
        }System.out.println(count);
        //System.out.println(count1);
        System.out.println(str2.replace("", "_"));
        String str3=new String("Dear |name|,thanks a lot");
        System.out.println(str3.replace("|name|", "ANMOL-007"));
        

    }
    
}
