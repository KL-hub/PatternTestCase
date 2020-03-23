package adapter.classadapter;

/**
 * @Description //类适配器，将220V的电压 转换为5V
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220v的电压
        int src = output220V();
        int dest =src/44;
        return dest;
    }
}
