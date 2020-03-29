package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class WeatherData  implements Subject{
    private List<Observer> list=new ArrayList<>();

    @Override
    public void registerObserve(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserve(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserve() {
        for (Observer observer : list) {
            observer.update(10.0f,12.0f,13.0f);
        }
    }
}
