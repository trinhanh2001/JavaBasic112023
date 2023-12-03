package trinhanh.com.javabasic.kieudulieu;

public class Kieudulieu1 {
    static String bankName ="Vietinbank";
    String chuTaiKhoan ="Trịnh Thị Anh";
    public static void main(String[] args) {

        System.out.println(bankName); //biến static gọi được trực tiếp trong hàm main(static) cùng class

        //muốn gọi biến instance thì phải khai báo 1 đối tượng
        Kieudulieu1 kieudulieu1 = new Kieudulieu1();
        System.out.println(kieudulieu1.chuTaiKhoan);

        //muốn gọi bien static trong class khác thì phải gọi className.tenbien
        System.out.println(Bank.balance);

    }
}
