package Strings;
class count_punctiation{
    public static void main(String args[]){
        String str="The examples of CPU's are: Intel,Ryzen,Snapdragon,Mediatek,Kirin,Exynos,Apple Bionic ";
        char ch1=',';
        char ch2='\'';
        char ch3=' ';
        int count1=0;//single quote
        int count2=0;//commas
        int count3=0;//spaces
        int count4=0;//no. of capital letters
        int count5=0;//no. small leters
        for (int i = 0; i <str.length(); i++) {
            if(ch1==str.charAt(i)){
                count1++;
            }if(ch2==str.charAt(i)){
                count2++; 
            }if(ch3==str.charAt(i)){
                count3++;
            }if(str.charAt(i)<=90 &str.charAt(i)>=65){
                count4++;

            }if(str.charAt(i)>=97 & str.charAt(i)<=122){
                count5++;
            }

            
        }System.out.println("The no. of Single qoute in the string="+count2);
        System.out.println("The no. of Commas in the string="+count1);
        System.out.println("The no. of Spaces in the string="+count3);
        System.out.println("The no. of Capital letters in the string="+count4);
        System.out.println("The no. of Small letters in the string="+count5);

    }

}