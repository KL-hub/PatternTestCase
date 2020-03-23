package bridge;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Vivod implements Brand {
    @Override
    public void open() {
        System.out.println("vivod手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivod手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivod手机打电话");
    }
}
