import java.util.Scanner;
public class WK2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no,");
        double n1 = sc.nextDouble();
        System.out.println("Enter 2nd no, ");
        double n2 = sc.nextDouble();   
        System.out.println("Enter 3rdd no, ");
        double n3 = sc.nextDouble();
        double avg = (n1+n2+n3)/3;
        System.out.println("AVG is,  " + avg);
    }
}