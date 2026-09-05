/*
In this program we will create the following pattern:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
import java.util.Scanner;

public class pattern13{
    public static void pattern(int n){
        //for rows
        int start = 1;
        for(int i=1; i<=n; i++){
            //for pattern
            for(int j=1; j<=i; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the numberf of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}