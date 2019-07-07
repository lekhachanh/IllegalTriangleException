import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ba canh cua tam giac: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Khong phai ba canh cua tam giac!");
        }else {
            System.out.println("la ba canh cua tam giac");
        }
    }
}
