package trinhanh.com.javabasic.LearnJavaBasic.LearnCollection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("name","hellen");
        hashMap.put("age","22");
        hashMap.put("address","HN");
        hashMap.put("age","23");
        hashMap.put("phone","08749284");

        System.out.println("Các phần tử của hashMap: ");
        System.out.print("\t"+ hashMap +"\n");

        //dùng hashMap trong 2 TH sau: đọc file JSON, Thiết lập config cho Driver trong Selenium

        hashMap.remove("age");
        System.out.println("Xóa 1 phần tử thành công ");
        System.out.println("Các phần tử còn lại của hashMap: ");
        System.out.print("\t"+ hashMap+"\n");

        System.out.println(hashMap.containsKey("phone"));
        System.out.println(hashMap.containsValue("HN"));

        //truy xuất giá trị theo từng key
        System.out.println("Xuất giá trị theo key name: "+hashMap.get("name"));

        //get hết giá trị của key và value
                for (Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
