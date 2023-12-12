package javaLearningCode;

public class MergeTwoStrings {

    /*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
     */

    public static void main(String[] args) {

        MergeTwoStrings.mergeTwoString("ab", "pqr");
        MergeTwoStrings.mergeTwoString("abcd", "pqr");
    }

    public static void mergeTwoString(String str1,String str2){
        String newWord="";
        if(str1.length()>str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                newWord+=""+str1.charAt(i)+str2.charAt(i);
            }
            newWord=newWord+str1.substring(str2.length());
        }else {
            for (int i = 0; i < str1.length(); i++) {
                newWord+=""+str1.charAt(i)+str2.charAt(i);
            }
            newWord=newWord+str2.substring(str1.length());
        }


        System.out.println(newWord);
    }

}
