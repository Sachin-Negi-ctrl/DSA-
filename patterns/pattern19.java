/*
In this program we will print this pattern:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.Scanner;

public class pattern19 {
    public static void pattern(int n){
        //for rows
        for(int i=1; i<=2*n; i++){
            //for leading stars
            if(i<=n){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
                }else{
                    for(int j=1; j<=i-n; j++){
                        System.out.print("*");
                    }
            }
            //for space
            if(i<=n){
                for( int k=1; k<2*i-1; k++){
                    System.out.print(" ");
                }
            }else{
                for(int k=1; k<=2*(2*n-i); k++){
                    System.out.print(" ");
                }
            }
            //for trailing stars
            if(i<=n){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
                }else{
                    for(int j=1; j<=i-n; j++){
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}
