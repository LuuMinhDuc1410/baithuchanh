import java.util.Scanner;

public class Bai1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1. Tinh tong, hieu, tich, thuong, chia lay du cua 2 so do
    System.out.println("Nhap vao so thu nhat ");
    int a = sc.nextInt();
    System.out.println("Nhap vao so thu hai ");
    int b = sc.nextInt();
    System.out.println("a + b = " + (a + b));
	System.out.println("a - b = " + (a - b));
	System.out.println("a * b = " + (a * b));
	System.out.println("a / b = " + ((float) a / b));
	System.out.println("a % b = " + (a % b));
    // 2. Su dung toan tu de so sanh 2 so do
    System.out.println("Ket qua so sanh bang 2 so " + a + " va " + 
    b + " la " + (a == b));
System.out.println("Ket qua so sanh khong bang 2 so " + a + " va " + 
    b + " la " + (a != b));
System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " + 
    b + " la " + (a > b));
System.out.println("Ket qua so sanh lon hon hoac bang 2 so" + a + " va " + 
    b + " la " + (a >= b));
System.out.println("Ket qua so sanh nho hon 2 so " + a + " va " + 
    b + " la " + (a < b));
System.out.println("Ket qua so sanh nho hon hoac bang 2 so " + a + " va " + 
    b + " la " + (a <= b));
 }   
}