package Nhom13;
import java.util.Scanner;
import java.lang.Math;

public class HinhTamGiac {
	protected double canhA,canhB,canhC;
	Scanner scn = new Scanner(System.in);
	
	public void nhap() {
        do {
            System.out.println("Nhap do dai canh thu nhat: ");
            canhA = scn.nextDouble();
        }while(canhA<=0);
        do {
            System.out.println("Nhap do dai canh thu hai: ");
            canhB = scn.nextDouble();
        }while(canhB<=0);
        do {
            System.out.println("Nhap do dai canh thu ba: ");
            canhC = scn.nextDouble();
        }while(canhC<=0);    
    }
	public double tinhChuVi(double a, double b, double c) {
		 return a + b + c;
	}
	public double tinhDienTich(double a, double b, double c) {
		 double p = tinhChuVi(a, b, c)/2;
		 return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public static void main(String[] args) {
		HinhTamGiac htg = new HinhTamGiac();
		htg.nhap();
		System.out.println("Chu vi cua tam giac: " +  htg.canhA + htg.canhB + htg.canhC);
		System.out.println("Chu vi cua tam giac: " +  htg.tinhChuVi(htg.canhA, htg.canhB, htg.canhC));
		System.out.println("Dien tich cua tam giac: " + htg.tinhDienTich(htg.canhA, htg.canhB, htg.canhC));
		System.out.println("Update lan 2");	
	}
}
