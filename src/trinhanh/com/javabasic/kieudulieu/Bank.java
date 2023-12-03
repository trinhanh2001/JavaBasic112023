package trinhanh.com.javabasic.kieudulieu;

public class Bank {
    static int balance = 237883; //biến static trong class khác cùng package
   static String address ="Sóc sơn, Hà Nội";
   static String phone ="098736234";
   static float interest_rate = 7.3f;

   public static void getInforBank() {
       System.out.println(Kieudulieu1.bankName);
       System.out.println(Bank.address);
       System.out.println(Bank.phone);
       System.out.println(Bank.interest_rate);
   }

   public static float getInterest_rate(){
       return interest_rate;
   }
}
