import java.util.*;
public class Treeset_hw{
    public static void main(String[] args){
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼....");
        TreeSet<Integer> tset = new TreeSet<>();
        int r = 0;
        for(int i=1;i<=10;i++){
            r = (int)(Math.random()*100)+1;
	    tset.add(r);
            System.out.println("第 " + i + " 個號碼: " + r);
	}
        System.out.println("物件內元素個數為：" + tset.size());
        System.out.println("物件內元素的內容：" + tset);
        System.out.println("第一個元素內容為：" + tset.first());
        System.out.println("最後一個元素內容為：" + tset.last());
        System.out.println("內容介於30~70者："+tset.subSet(30,70));
    
    }
}


