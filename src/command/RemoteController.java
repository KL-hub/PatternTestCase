package command;

import javax.xml.soap.Node;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/25
 * @Version 1.0
 */
public class RemoteController {
    // 开 按钮的命令数组
    Command [] onCommand;
    Command[] offCommand;

    //执行撤销的命令
    Command  undoCommand;

    //构造器，完成对按钮的初始化
    public RemoteController() {
        onCommand=new Command[5];
        offCommand=new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommand[i]=new NoCommand();
            offCommand[i]=new NoCommand();
        }
    }
    //给按钮设置你需要的命令
    public void  setCommand(int no,Command onCommand1,Command offCommand1){
        onCommand[no]=onCommand1;
        offCommand[no]=offCommand1;
    }
    //按下开按钮
    public void onButtonWasPushed(int no){
        onCommand[no].execute();
        //记录按钮，用于撤销
        undoCommand= onCommand [no];
    }
    //按下关按钮
    public void offButtonWasPushed(int no){
        offCommand[no].execute();
        //记录按钮，用于撤销
        undoCommand= offCommand [no];
    }
    //按下撤销按钮
    public void undoButtonWasPushed(int no){
        undoCommand.undo();
    }
}
