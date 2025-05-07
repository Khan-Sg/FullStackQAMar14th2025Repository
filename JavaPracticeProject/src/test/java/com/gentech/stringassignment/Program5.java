package com.gentech.stringassignment;

public class Program5 {
    public static void main(String[] args) {
        javacount();
    }
    static void javacount(){
        String s="Java jre Java jvm java jdk java";
        String s1[]=s.split(" ");
        int count=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i].equals("Java")){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
