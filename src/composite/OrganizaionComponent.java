package composite;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public abstract class OrganizaionComponent {
    private String name;
    private String desc;
    protected void add(OrganizaionComponent organizaionComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizaionComponent organizaionComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizaionComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    //子类实现
    protected abstract void print();
}
