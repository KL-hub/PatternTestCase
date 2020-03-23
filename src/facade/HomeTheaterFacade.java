package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;
    //构造器
    public HomeTheaterFacade(){
        theaterLight=TheaterLight.getInstance();
        dvdPlayer=DVDPlayer.getInstance();
        popcorn=Popcorn.getInstance();
        stereo=Stereo.getInstance();
        screen=Screen.getInstance();
    }
    //执行一系列操作
    public void ready(){
        theaterLight.dim();
        //..................
    }

}
