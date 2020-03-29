package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class CareTaker {
    //存放备忘录对象
    private List<Menmento> list=new ArrayList<>();

    public void add(Menmento  m){
        list.add(m);
    }
    public Menmento get(int index){
        return list.get(index);
    }
}
