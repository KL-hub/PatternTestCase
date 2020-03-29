package visitor;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import	java.util.LinkedList;

import java.security.Permission;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/25
 * @Version 1.0
 */
//数据结构
public class ObjectStructure {
    //维护一个集合
    private List<Person> persons=new LinkedList<Person> ();
    //增加到List
    public void attach(Person  person){
        persons.add(person);
    }
    //移除
    public void detach(Person p){
        persons.remove(p);
    }
    //
    public void display(Action action){
        persons.forEach(person -> {
            person.accept(action);
        });
    }

}
