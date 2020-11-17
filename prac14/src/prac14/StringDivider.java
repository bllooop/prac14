package prac14;

import java.util.Scanner;

public class StringDivider {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] strToArray = str.toCharArray();
int k=0;
    public StringDivider() {
        //  if (str.substring(0,1).equals("+")){
        if (str.charAt(0) == '+') {

            System.out.print(strToArray[0]);
            System.out.print(strToArray[1]);
           for(int i = 2; i < strToArray.length-1; i++) {
                if (k==3){
                    System.out.print("-");
                    k=0;
                }
                System.out.print(strToArray[i]);
                k++;
            }
            System.out.print(strToArray[11]);
            }
        if (str.charAt(0) == '8') {
            System.out.print("+7");
            for(int i = 1; i < strToArray.length-1; i++) {
                if (k==3){
                    System.out.print("-");
                    k=0;
                }
                System.out.print(strToArray[i]);
                k++;
            }
            System.out.print(strToArray[10]);
        }
    }
}
