package adapter.classadapter;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());

    }
}
