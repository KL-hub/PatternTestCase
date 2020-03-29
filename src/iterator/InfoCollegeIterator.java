package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class InfoCollegeIterator  implements Iterator {
    List<Department> departments;
    int index=-1;
    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index > departments.size() - 1){
            return false;
        }
        index+=1;
        return false;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
