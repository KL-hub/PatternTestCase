package bridge;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/2
 * @Version 1.0
 */
public abstract  class Phone {
    //聚合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }
}
