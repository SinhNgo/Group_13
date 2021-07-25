
package Test_github;
import java.util.Scanner;
public class Chuvihinhtron {
		class DienTichChuViHT {
		    public  double tinhDienTich(double r) {
		        return r * r * 3.14;
		    }
		    public  double tinhChuVi(double r){
		        return r * 2 * 3.14;
		    }
		    public  void main(String[] args) {
		        double r;
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Nhập bán kính hình tròn: ");
		        r = scanner.nextDouble();
		        System.out.println("Diện tích hình tròn là: " + tinhDienTich(r));
		        System.out.println("LeVietTinhNew ");
		}
		}
	}

