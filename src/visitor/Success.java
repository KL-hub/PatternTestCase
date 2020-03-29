package visitor;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/25
 * @Version 1.0
 */
public class Success  implements Action {


    @Override
    public void opreation1(Man man) {
        System.out.println("男人给的评价成功");
    }

    @Override
    public void opreation2(Woman woman) {
        System.out.println("女人给的评价成功");

    }
}
