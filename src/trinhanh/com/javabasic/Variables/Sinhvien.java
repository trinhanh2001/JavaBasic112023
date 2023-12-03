package trinhanh.com.javabasic.Variables;


public class Sinhvien {
    public static String job ="IT-QA"; // biến static được lưu trong suốt qtrinh chạy ctrinh => vd lưu url, email,pass => đỡ nhập nhiều lần trong khi chạy
    public String ten;   // biến instance "ten" kiểu String, có giá trị mặc định là null
    private int tuoi;  // biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
    // sử dụng biến ten trong một constructor
    public Sinhvien(String ten) {
        this.ten = ten;
    }

    // sử dụng biến tuoi trong phương thức setTuoi
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        String phone ="037874723"; // biến local không sd access modifier, bắt buộc khởi tạo giá trị mặc định, khai báo và chỉ sd trong hàm
        System.out.println("Ten  : " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("SDT : " + phone);
    }

    public static void main(String args[]) {
        // cần khai báo đổi tượng cụ thể để truy cập được biến instance
        Sinhvien sv = new Sinhvien("Trịnh Thị Anh");
        sv.setTuoi(21);
        sv.showStudent();
        System.out.println("Công việc: "+ job); // biến static gọi được trực tiếp trong hàm static
    }
}