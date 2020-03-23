package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Projector {
    private static Projector instance=new Projector();
    public static Projector getInstance() {
        return instance;
    }
    public void on(){
        System.out.println(" Projector  on");
    }
    public void off(){
        System.out.println(" Projector  off");
    }
    public void focus(){
        System.out.println(" Projector  is focus");
    }
}
