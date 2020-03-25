package flyweight;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use();


    }
}
