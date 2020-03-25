package command;

import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class Test {
   /* public static void main(String[] args) {
        HashMap<String, User> hashMap = new HashMap<>();
        hashMap.put("1", new User("li", 10));
        hashMap.put("2", new User("zhang", 13));
        hashMap.put("3", new User("zao", 12));

        System.out.println(hashMap.values().stream().sorted(User,(s1,s2)->s1.compareTo(s2)));

        //打印
        for (Map.Entry<String, User> entry : hashMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue().getName() +" ");

        }
    }*/
   public static void main(String[] args) {
       User user1 = new User("zs", 10);
       User user2 = new User("ls", 5);
       User user3 = new User("wu", 20);
       Map<String, User> map = new HashMap<>();
       map.put(user1.getName(), user1);
       map.put(user2.getName(), user2);
       map.put(user3.getName(), user3);

       System.out.println("------map sort by key------");
       map.entrySet().
               stream().
               sorted(Map.Entry.comparingByKey()).
               forEach(System.out::println);

       System.out.println("------map sort by value------");
       map.entrySet().
               stream().
               sorted(Map.Entry.comparingByValue()).
               forEach(System.out::println);


       System.out.println("------return sorted by key map ------");
       TreeMap<String,User> treeMap=new TreeMap<>(map);
       System.out.println(treeMap);

       System.out.println("------return sorted by value map ------");
       Map<String, User> result = map.entrySet()
               .stream()
               .sorted(Map.Entry.comparingByValue())
               .collect(Collectors.toMap(
                       Map.Entry::getKey,
                       Map.Entry::getValue,
                       (oldValue, newValue) -> oldValue, LinkedHashMap::new));
       System.out.println(result);

   }
}
