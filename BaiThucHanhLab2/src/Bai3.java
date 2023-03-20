import java.util.Scanner;
 
public class Bai3 {
 
    public static void main(String[] args) {
        int age;
        String ageGroup;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Nhap vao ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        int year = sc.nextInt();
         
        // Xác định độ tuổi tương ứng
        age = 2023 - year;  // 2023 là năm hiện tại
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "gia roi!";
        }
         
        System.out.println("Ban " + name + " thuoc nhom " + ageGroup);
    }
 
}