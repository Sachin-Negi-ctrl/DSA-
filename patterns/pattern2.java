/*
This snippet will print the patter :
* 
* *
* * *
* * * * 
* * * * *  

up until n

*/

import java.util.Scanner;

public class pattern2{

    public static void pattern(int n){
        for(int i=1; i<=n; i++){ //For printing next line or terminating a line.
            for(int j=1; j<=i; j++){
                System.out.print("* "); //For printing *
            }
            System.out.println(); //Line terminator
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of lines :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern(n);
    }
}