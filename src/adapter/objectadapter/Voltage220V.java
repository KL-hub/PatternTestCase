package adapter.objectadapter;

/**
 * @Description //对象适配器(输出220V的电压)
 * @Author 李项
 * @Date 2020/2/29
 * @Version 1.0
 */
public class Voltage220V {
    public int output220V(){
        int src=220;
        System.out.println("电压"+src +"伏");
        return src;
    }
}
