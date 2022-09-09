package com.String;

public class AlphabetCount {
    public static void main(String[]args){
        String str="Chennai 600042";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'){
                if(str.charAt(i)<='z'){
                    System.out.print(str.charAt(i));
                }


            }
            else if(str.charAt(i)>='A'){
                if(str.charAt(i)<='Z')
                    System.out.print(str.charAt(i));

            }


        }

      // System.out.println( str.replaceAll("[a-zA-Z]",""));
       // System.out.println( str.replaceAll("[0-9]",""));

    }
}
