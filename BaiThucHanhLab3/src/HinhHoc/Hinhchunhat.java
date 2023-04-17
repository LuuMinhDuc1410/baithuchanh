package HinhHoc;

import java.util.Scanner;

public class Hinhchunhat {
    float dai;
    float rong;
    float cv;
    float dt;

    public void nhapChieuDai() {
        System.out.println("Hay nhap chieu dai vao hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Hay nhap chieu rong vao hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * (dai + rong);
    }

    public void tinhDientich() {
        dt = dai * rong;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh chu nhat: " + cv);
    }

    public void inDienTich() {
        System.out.println("Dien tich hinh chu nhat: " + dt);
    }
}