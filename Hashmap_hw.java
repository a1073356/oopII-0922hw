import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_hw {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        
        hmap.put(1,"January");
        hmap.put(2,"February");
        hmap.put(3,"March");
        hmap.put(4,"April");
        hmap.put(5,"May");
        hmap.put(6,"June");
        hmap.put(7,"July");
        hmap.put(8,"August");
        hmap.put(9,"September");
        hmap.put(10,"October");
        hmap.put(11,"November");
        hmap.put(12,"December");
       
        while(true){
            System.out.print("請輸入1~12? ");
            Scanner scanner = new Scanner(System.in);
            Integer num = scanner.nextInt();
            if(hmap.containsKey(num)){
                System.out.println("第"+num+"月的英文單字為"+hmap.get(num));
            }else{
                System.out.println("範圍錯誤!");
            }
        }

    }
}