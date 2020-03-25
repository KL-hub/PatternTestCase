package template;

/**
 * @Description //抽象类，表示豆浆
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public abstract class SoyaMilk {
    //模板方法，make,模板方法可以做成final,不让子类去继承
    final void make(){
        select();
        addCondiment();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步");
    }
    //子类去实现
    abstract void addCondiment();

    void soak(){
        System.out.println("第三步");
    }
    void beat(){
        System.out.println("第四步");
    }
}
