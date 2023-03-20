import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ki tu");
        String s = scanner.nextLine();

        System.out.println("Nhap vao ki tu");
        char c = scanner.next().charAt(0);

        int count = 0;
        for(int i = 0;i < s.length(); i++ ){
            if(s.charAt(i) == c){
                count ++;
            }
        }
        System.out.println("So lan xuat hien ki tu " + c + " trong chuoi la " + count);
    }
}