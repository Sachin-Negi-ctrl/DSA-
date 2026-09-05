/*
In this program we will print the following pattern:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1 
*/
import java.util.Scanner;

public class pattern11{
    public static void pattern(int n){
        //for rows
        int start = 1;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                start = 0;
            }else{
                start = 1;
            }
            //for pattern
            for(int j=1; j<=i; j++){
                System.out.print(start+" ");
                start = 1-start;
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