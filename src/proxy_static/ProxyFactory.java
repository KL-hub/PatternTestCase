package proxy_static;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class ProxyFactory   implements ITeacherDao{
   private ITeacherDao iTeacherDao;

    public ProxyFactory(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("静态代理");
        iTeacherDao.teach();
        System.out.println("静态代理结束");
    }
}
