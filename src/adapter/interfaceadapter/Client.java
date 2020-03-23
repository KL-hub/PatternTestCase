package adapter.interfaceadapter;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/1
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter=new AbsAdapter(){
            @Override
            public void m3() {
                System.out.println("      ");
            }
        };
        absAdapter.m3();
    }
}
