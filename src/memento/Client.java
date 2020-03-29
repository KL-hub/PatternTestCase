package memento;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("  状态1");
        careTaker.add(originator.saveStateMemento());//保存对象

        originator.setState("  状态2");
        careTaker.add(originator.saveStateMemento());//保存对象

        System.out.println(careTaker.get(0).getStatus());

    }
}
