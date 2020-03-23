package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Popcorn {
    private static Popcorn instance=new Popcorn();
    public static Popcorn getInstance() {
        return instance;
    }
    public void on(){
        System.out.println(" popcorn  on");
    }
    public void off(){
        System.out.println(" popcorn  off");
    }
    public void pop(){
        System.out.println(" popcorn  is poping");
    }
}
