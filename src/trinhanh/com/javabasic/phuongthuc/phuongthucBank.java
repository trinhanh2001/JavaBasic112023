package trinhanh.com.javabasic.phuongthuc;

import trinhanh.com.javabasic.kieudulieu.Bank;

public class phuongthucBank {
    public static void main(String[] args) {
        Bank.getInforBank();
        double tienLai = (Bank.getInterest_rate() * 1000000) /100;
        System.out.println("Tiền lãi: "+tienLai);

    }


}
