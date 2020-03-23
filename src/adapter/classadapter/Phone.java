package adapter.classadapter;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class Phone {
    //充电
    public void charge(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压5v可以充电");
        }else {
            System.out.println("电压不正常");
        }
    }
}
