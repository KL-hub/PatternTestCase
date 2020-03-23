package decorator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Coffee extends  Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
