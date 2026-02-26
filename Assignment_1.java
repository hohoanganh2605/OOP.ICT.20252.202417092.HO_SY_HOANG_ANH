import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a + b;
        double diff = a - b;
        double prod = a * b;
        System.out.println("The sum of a and b is : " + sum);
        System.out.println("The difference between a and b is : " + diff);
        System.out.println("The product of a and b is : " + prod);
    }
}
