package proxy_jdk;

/**
 * @Description //静态代理
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class TeacherDao  implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}
