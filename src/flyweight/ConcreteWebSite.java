package flyweight;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class ConcreteWebSite extends WebSite {
    private String type="";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use() {
        System.out.println("网站的发布形式为"+type);
    }
}
