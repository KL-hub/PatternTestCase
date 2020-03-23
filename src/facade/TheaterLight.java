package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class TheaterLight {
    private static TheaterLight instance=new TheaterLight();
    public static TheaterLight getInstance() {
        return instance;
    }
    public void dim(){
        System.out.println(" TheaterLight  dim");
    }
    public void on(){
        System.out.println(" TheaterLight  on");
    }
    public void off(){
        System.out.println(" TheaterLight  is off");
    }
    public void bright(){
        System.out.println(" TheaterLight  is bright");
    }
}
