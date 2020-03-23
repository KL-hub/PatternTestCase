package bridge;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠式手机
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMI());
        foldedPhone.open();

    }
}
