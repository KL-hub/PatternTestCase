package iterator;
import	java.util.Iterator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public interface College {
    String getName ();

    //增加系的方法
    void Department(String name,String desc);

    //返回一个迭代器，遍历
    Iterator createIterator();

}
