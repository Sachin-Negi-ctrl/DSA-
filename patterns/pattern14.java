/*
In this program we will print the following pattern:
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;

public class pattern14 {
    public static void pattern(int n){
        //for rows
        for(int i=1; i<=n; i++){
            //for pattern
            for(char ch='A'; ch<'A'+i; ch++){
                System.out.print(ch);
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
