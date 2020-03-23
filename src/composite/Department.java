package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Department extends  OrganizaionComponent {
    //构造器
    public Department(String name, String desc) {
        super(name, desc);
    }


    @Override
    protected void print() {
        System.out.println("-------------"+getName()+"------------");
    }

}
