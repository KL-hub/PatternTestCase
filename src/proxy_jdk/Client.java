package proxy_jdk;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao proxyFactory =(ITeacherDao) new ProxyFactory(new TeacherDao());
        proxyFactory.teach();

    }
}
