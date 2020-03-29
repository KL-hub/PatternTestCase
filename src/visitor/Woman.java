package visitor;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/25
 * @Version 1.0
 */
public class Woman extends  Person {


    @Override
    void accept(Action action) {
        action.opreation2(this);
    }
}
