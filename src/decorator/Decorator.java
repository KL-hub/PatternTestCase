package decorator;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public class Decorator extends  Drink {
    private Drink obj;

    public Decorator(Drink obj) {//组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes()+" "+super.getPrice()+" && " +obj.getDes();
    }
}
