package trinhanh.com.javabasic.LearnJavaBasic.LearnCollection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("PHP");
        hashSet.add("Java");
        hashSet.add("C#");


        System.out.println("Mảng: " +hashSet);
        System.out.println("Số lượng phần tử: "+ hashSet.size());
        System.out.println("Xóa phần tử thứ 2 phải dùng value để xóa: "+ hashSet.remove("PHP"));
        System.out.println(hashSet.size());
        System.out.println("Check list có chứa java không: " + hashSet.contains("JAVA"));

        for(String mon : hashSet){
            System.out.println("Tên thành phần trong mảng: " + mon);
        }
    }
}
