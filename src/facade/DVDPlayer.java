package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class DVDPlayer {
    private static DVDPlayer instance=new DVDPlayer();
    public static DVDPlayer getInstance() {
        return instance;
    }
    public void on(){
        System.out.println(" dvd on");
    }
    public void off(){
        System.out.println(" dvd off");
    }
    public void play(){
        System.out.println(" dvd play");
    }

    public void pause(){
        System.out.println(" dvd pause");
    }


}
