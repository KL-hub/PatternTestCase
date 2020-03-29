package observer;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class Client  {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        weatherData.registerObserve(new Baidu());
        weatherData.registerObserve(new Sina());

        weatherData.notifyObserve();

    }
}
