package decorator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDes());

        //加入一杯牛奶
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        //加入一杯巧克力
        order=new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
    }
}
