package com.gentech.stringassignment;
public class Program7 {
    public static void main(String[] args) {
        palindrome();
    }
    static void palindrome(){
        String s="Madam";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1)) {
            System.out.println("The String is palindrome :");
        }
        else{
            System.out.println("The Given STring is not a palindrome :");

        }
    }

}
