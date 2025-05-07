package com.gentech.stringassignment;
public class Program8 {
    public static void main(String[] args) {
        weekday();
        commo();
        nouse();
    }

    static void weekday() {
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String s1[] = s.split("DAY");
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);

        }
        System.out.println();
    }
    static void commo(){
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String s2=s.replace("DAY","DAY,");
        System.out.println(s2);
    }
    static void nouse(){
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String s2="";
        for(int i=0;i<s.length();i++){
            s2 +=s.charAt(i);
            if(s.charAt(i)=='Y'){
                s2 +=",";
            }
        }
        System.out.println(s2);

    }
}

