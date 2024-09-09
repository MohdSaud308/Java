import java.util.Scanner;
public class W3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        while (n > 10) {
            System.out.println("Current number: " + n);
            n = n / 2;
        }
        System.out.println("Final number " + n); 
}
}