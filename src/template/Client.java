package template;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        ReadBeanSoyaMilk readBeanSoyaMilk = new ReadBeanSoyaMilk();
        readBeanSoyaMilk.make();

        System.out.println("制作花生豆浆");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();


    }
}
