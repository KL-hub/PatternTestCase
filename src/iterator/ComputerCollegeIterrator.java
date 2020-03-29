package iterator;

import java.util.Iterator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class ComputerCollegeIterrator implements Iterator {

    Department[] departments;
    int position=0;
    public ComputerCollegeIterrator(Department[] departments) {
        this.departments = departments;
    }
    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position]== null) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;
        return department;
    }

    @Override
    public void remove() {

    }
}
