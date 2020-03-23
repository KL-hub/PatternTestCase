package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class University extends OrganizaionComponent {
    //构造器
    public University(String name, String desc) {
        super(name, desc);
    }

    List<OrganizaionComponent> list=new ArrayList<OrganizaionComponent>();

    @Override
    protected void print() {
        System.out.println("-------------"+getName()+"------------");
        for (OrganizaionComponent organizaionComponent : list) {
            organizaionComponent.print();
        }
    }
    //重写add
    @Override
    protected void add(OrganizaionComponent organizaionComponent) {
        list.add(organizaionComponent);
    }

    @Override
    protected void remove(OrganizaionComponent organizaionComponent) {
        list.remove(organizaionComponent);
    }
}
