package Nhom13;
import java.util.Scanner;

public class HinhChuNhat {
	protected double chieuDai, chieuRong, chuVi, dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public void nhap() {
        do {
            System.out.println("Nháº­p chiá»�u dÃ i hÃ¬nh chá»¯ nháº­t: ");
            chieuDai = scanner.nextDouble();
            System.out.println("Nháº­p chiá»�u rá»™ng hÃ¬nh chá»¯ nháº­t: ");
            chieuRong = scanner.nextDouble();
        } while (chieuDai < chieuRong);
    }
     
    public void hienThi(double dai, double rong) {
        System.out.println("Chiá»�u dÃ i vÃ  chiá»�u rá»™ng cá»§a hÃ¬nh chá»¯ nháº­t láº§n lÆ°á»£t lÃ  "
                + chieuDai + "cm" + " vÃ  " + chieuRong+"cm");
    }
     
    public double tinhChuVi(double dai, double rong) {
        chuVi = (dai + rong) * 2;
        return chuVi;
    }
     
    public double tinhDienTich(double dai, double rong) {
        dienTich = dai * rong;
        return dienTich;
    }
     
    public void hienThiChuViVaDienTich(double cv, double dt) {
        System.out.println("Chu vi hÃ¬nh chá»¯ nháº­t = " + cv + "cm");
        System.out.println("Diá»‡n tÃ­ch hÃ¬nh chá»¯ nháº­t = " + dt +"cm2");
    }
    
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
         
        hinhChuNhat.nhap();
         
        // hiá»ƒn thá»‹ chiá»�u dÃ i vÃ  chiá»�u rá»™ng
        hinhChuNhat.hienThi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // tÃ­nh chu vi vÃ  diá»‡n tÃ­ch
        double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
        double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // hiá»ƒn thá»‹ chu vi vÃ  diá»‡n tÃ­ch
        hinhChuNhat.hienThiChuViVaDienTich(chuVi, dienTich);
        System.out.println("Class Ä‘Æ°á»£c táº¡o bá»Ÿi thÃ nh viÃªn Tráº§n Quá»‘c Tuáº¥n Gruop 13!");
    }
}

