/*
In this program we will print the pattern:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
*/


import java.util.Scanner;

public class pattern9{
     public static void pattern(int n){
        //for rows
        for(int i=1; i<n*2; i++){
            if(i<=n){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int k=1; k<=n*2-i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

public static void pattern1(int n){

    for(int i=0; i<n; i++){
        //for leading space
        for(int j=1; j<n-i; j++){
            System.out.print(" ");
        }
        //for stars
        for(int k=0; k<2*i+1; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


    public static void pattern2(int n){
        //for rows
        for(int i=0; i<n; i++){
            //for space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=i; k<n*2-i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        pattern(n);
    }
}
