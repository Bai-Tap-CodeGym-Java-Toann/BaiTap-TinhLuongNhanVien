import java.util.Scanner;

public class Luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số năm làm việc: ");
        int year = sc.nextInt();
        System.out.print("nhập hệ số lương: ");
        int luong = sc.nextInt();
        while ((luong > 5) || (luong < 1)) {
            System.out.println("hệ số lương không hợp lệ!");
            System.out.println("nhập hệ số lương: ");
            luong = sc.nextInt();
        }
        System.out.println("lương tháng: " + (luong * 40000000 + year * 500000));
    }

}
