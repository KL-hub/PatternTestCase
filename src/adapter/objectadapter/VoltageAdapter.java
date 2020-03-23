package adapter.objectadapter;

/**
 * @Description //对象适配器模式，将220V的电压 转换为5V
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;
    //通过构造器传入
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5V() {
        int dest=0;
        if(null != voltage220V) {
            //获取到220v的电压
            int src = voltage220V.output220V();
            System.out.println("对象适配器模式，进行适配");
            dest =src/44;
            System.out.println("适配完成");
            return dest;
        }
        return dest;
    }
}
