package javalearningcode;

public class GreatestCommonDivisor {

    /*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     */


    public String gcdOfStrings(String str1, String str2) {
        String commonDivider="";
        String minSizeString="";
        String maxSizeString="";
        if(str1.length()>str2.length()){
            minSizeString=str2;
            maxSizeString=str1;
        }else {
            minSizeString=str1;
            maxSizeString=str2;
        }

            for (int i = 0; i < minSizeString.length(); i++) {
                if(minSizeString.charAt(i)==maxSizeString.charAt(i)){
                    commonDivider=commonDivider+minSizeString.charAt(i);
                }else {
                    break;
                }

            }


         return commonDivider;
    }
}
