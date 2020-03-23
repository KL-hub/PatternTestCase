package decorator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Milk extends  Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶");
        setPrice(2.0f);
    }
}
