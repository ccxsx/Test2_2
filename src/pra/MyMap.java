package pra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        System.out.println("a");
        int i;
        HashMap<String, String> mymap = new HashMap<>();
        mymap.put("hwy", "黄婉仪");
        mymap.put("czx", "陈梓勋");
        mymap.put("qcl","陈绮琳");
        String hwy = mymap.get("hwy");
        System.out.println(hwy);
        Set<String> strings = mymap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(mymap.get(next));

        }
        System.out.println("-----------------------------");
        for(String key:strings){
            System.out.println("key is "+key);
            System.out.println(mymap.get(key));
        }

    }

}
