import java.util.Scanner;

public class pattern10 {
    public static void pattern1(int n){
        //for rows
        for(int i=0; i<n; i++){
            //for stars
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        //for rows
        for(int i=0; i<n-1; i++){
            //for stars
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
    }
}
