package command;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/25
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作
        LightReceiver lightReceiver = new LightReceiver();
        
        //创建电灯开关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //创建电灯关闭的命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        
        //一个遥控器控制
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("=================按下灯的开按钮==============");
        remoteController.onButtonWasPushed(0);

        System.out.println("=================按下灯的关按钮==============");
        remoteController.offButtonWasPushed(0);

        System.out.println("=================按下灯的撤销按钮==============");
        remoteController.undoButtonWasPushed(0);


    }
}
