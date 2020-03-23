package adapter.objectadapter;

/**
 * @Description /
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220V()));

    }
}
