package observer;


/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public interface Subject {
    void  registerObserve(Observer o);
    void  removeObserve(Observer o);
    void  notifyObserve();

}
