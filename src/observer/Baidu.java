package observer;
import java.util.Observable;


/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class Baidu implements Observer {

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("百度网站更新气象");
    }
}
