package facade;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Screen {
    private static Screen instance=new Screen();
    public static Screen getInstance() {
        return instance;
    }
    public void up(){
        System.out.println(" Screen  up");
    }
    public void down(){
        System.out.println(" Screen  down");
    }
    public void focus(){
        System.out.println(" Screen  is focus");
    }
}
