package memento;

/**
 * @Description //备忘录对象
 * @Author 李项
 * @Date 2020/3/26
 * @Version 1.0
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //编写一个方法，可以保存一个状态对象Memento
    public Menmento saveStateMemento(){
        return new Menmento(state);
    }
    //
    public void getStateFromMemento(Menmento menmento){
        state=menmento.getStatus();
    }
}
