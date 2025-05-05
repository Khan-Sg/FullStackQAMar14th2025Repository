package p3;

import java.sql.SQLOutput;

public class Dowhile {
    public static void main(String[] args) {
        int num=6,i=1;
        do{

            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }while(i<=10);
    }
}
