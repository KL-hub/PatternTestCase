package decorator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
