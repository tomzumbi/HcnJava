import java.util.Scanner;

public class HinhChuNhat {
        double chieudai;
        double chieurong;
    public HinhChuNhat(double chieudai , double chieurong){
        this.chieudai =  chieudai;
        this.chieurong =  chieurong;
    }
    public  double chuvi(){
        return  (this.chieudai + this.chieurong) * 2 ;
    }
    public double dientich(){
        return this.chieudai*chieurong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double chieudai = scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double chieurong = scanner.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieudai,chieurong);
        System.out.println(hcn.chuvi());
    }
}




