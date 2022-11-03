import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("01", 1);
        hashMap.put("02", 2);
        hashMap.put("03", 3);

        System.out.println(hashMap.get("01"));
        System.out.println(hashMap.values());


    }
}