import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n;
        long giaithua = 1;
        do{
            System.out.println("Nhap vao 1 so nguyen duong");
            n = sc.nextInt();
        }while((n <= 0) || (n > 10));
        while (i <= n) {
            giaithua *= i;
            i++;
        }
        System.out.println(n + "! = " + giaithua);

        
         
    }
     
}