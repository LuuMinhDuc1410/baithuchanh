import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi bat ki: ");
        String s = sc.nextLine();

        int kiTuthuong = 0;
        int kiTuhoa = 0;
        int kiTuso = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                kiTuthuong++;
            } else if (Character.isUpperCase(c)) {
                kiTuhoa++;
            } else if (Character.isDigit(c)) {
                kiTuso++;
            }
        }

        System.out.println("So ki tu thuong trong chuoi: " + kiTuthuong);
        System.out.println("So ki tu hoa trong chuoi: " + kiTuhoa);
        System.out.println("So ki tu chu so trong chuois: " + kiTuso);

        sc.close();
    }
}