/*
In this program we will print the following pattern:
1        1
12      21
123    321
1234  4321
1234554321
*/
import java.util.Scanner;

public class pattern12 {
    
    public static void pattern(int n){
        //for rows
        for(int i=1; i<=n; i++){
            //for leading part
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            //for middle part
            for(int k=1; k<=(n*2)-(i*2); k++){
                System.out.print(" ");
            }
            //for trailing part
            for(int l=i; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
