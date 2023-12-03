package trinhanh.com.javabasic.phuongthuc;

public class phuongThucCoThamSo {
    static float interest_rate =7.3f;

    public static void tienLai(long tienGui){
        System.out.println("Lãi suất 12 tháng : "+ ((tienGui*interest_rate)/100));
    }

    public static int tong2SoNguyen(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        tienLai(10000000);
        System.out.println("Tổng 2 số nguyên: " + tong2SoNguyen(10,5));
    }

}
