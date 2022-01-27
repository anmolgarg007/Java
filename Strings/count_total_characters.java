package Strings;

public class count_total_characters {
    public static void main(String args[]){
        int length,count=0;
        char spaces=' ';
        String name=new String("I am a student of Sharda University");
        length=name.length();
        System.out.println("The lenght of the string="+length);
        for (int i = 0; i <length; i++) {

            if(spaces==name.charAt(i)){
                count++;
            }
        }System.out.println("The no of characters in your string="+(length-count));


    }
    
}
