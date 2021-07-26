package Nhom13;
import java.util.Scanner;
public class nhom13 {
	class DienTichChuViHT {
	    public double tinhDienTich(double r) {
	        return r * r * 3.14;
	    }
	    public  double tinhChuVi(double r){
	        return r * 2 * 3.14;
	    }
	    public void main(String[] args) {
	        double r;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập bán kính hình tròn: ");
	        r = scanner.nextDouble();
	        System.out.println("Diện tích hình tròn là: " + tinhDienTich(r));
	        System.out.println("Chu vi hinh tron la: " + tinhChuVi(r));
	        System.out.println("---------------------------------------");
	        System.out.println("Update bởi thành viên Trần Quốc Tuấn!");
	        System.out.println("Update by Huỳnh Văn Khánh 2");
	}
	}
}
