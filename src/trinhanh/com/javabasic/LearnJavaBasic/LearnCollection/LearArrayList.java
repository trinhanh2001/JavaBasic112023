package trinhanh.com.javabasic.LearnJavaBasic.LearnCollection;

import java.util.ArrayList;
import java.util.List;

public class LearArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hellen");
        arrayList.add("Linda");
        arrayList.add(("Anna"));
        arrayList.add("Hellen");
        arrayList.add("CLover");

        System.out.println("Tổng số phần tử trong mang: " +arrayList.size());
        System.out.println("Mảng: "+arrayList);
        System.out.println("Xóa 1 phần tử: " +arrayList.remove(1));
        System.out.println("Tổng số phần tử trong mang: " +arrayList.size());

        System.out.println("Mảng: "+arrayList);
        System.out.println("============");
        System.out.println("Từng phần tử trong mảng là: ");
        System.out.println("duyệt bằng for cơ bản: ");
        //vòng for bình thường
        for( int i= 0; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i) +", " );
        }
        System.out.print("\n");
        System.out.println("duyệt bằng for cải tiến: ");
        // vòng for cải tiến
        for (String phantu : arrayList){
            System.out.print(phantu + ", ");
        }
    }
}
