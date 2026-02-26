import java.util.Scanner;

public class Toan_Tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000, b = 3000;
        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b; // phép chia nguyên
        int mod = a % b;
        System.out.println(sum + " " + dif + " " + mul + " " + div + " " + mod);

        //Phép chia thập phân 
        float thuong = (float)a/b;
        System.out.printf("%.2f\n", thuong);

        //Nếu tích của 2 số int m,n vượt quá giới hạn int thì :
        int n = 100000, m = 100000000;
        long tich = 1L * n * m;
        System.out.println(tich);

        //Các hàm toán học:
        System.out.println(Math.abs(-1912));
        System.out.println(Math.max(10,299));
        System.out.println(Math.min(12,34));
        System.out.println(Math.pow(2,10));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(1000)); // Hàm căn bậc 3
        System.out.println(Math.ceil(3.122));
        System.out.println(Math.floor(12.323));

        //Comparison operator:
        System.out.println(10 < 20);
        System.out.println(30 > 20);
        System.out.println(23 == 34);

        //Logical operator:
        System.out.println((10 > 20) && (20 < 40));
        System.out.println((10 == 10) || (20 > 100));
        System.out.println(!(20 < 20));

        //Tăng giá trị cho biến
        int x = 100;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        //Toán tử 3 ngôi
        System.out.println(10 < 100 ? 20 : 40); // Nếu 10 < 100 đúng thì in ra 20, ngược lại in ra 40
    }
}
