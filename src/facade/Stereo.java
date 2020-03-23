package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Stereo {
    private static Stereo instance=new Stereo();
    public static Stereo getInstance() {
        return instance;
    }
    public void up(){
        System.out.println(" Stereo  up");
    }
    public void on(){
        System.out.println(" Stereo  on");
    }
    public void off(){
        System.out.println(" Stereo  is off");
    }
}
