package composite;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建学校
        OrganizaionComponent university = new University("清华大学", "中国顶级大学");
        //创建学院
        OrganizaionComponent college1=new College("计算机学院","计算机学院");
        OrganizaionComponent college2=new College("信息工程学院","信息工程学院");

        OrganizaionComponent department=new Department("软件工程","软件工程");
        OrganizaionComponent department2=new Department("网络工程","网络工程");
        OrganizaionComponent department3=new Department("计算机科学与技术","计算机科学与技术");

        college1.add(department);
        college1.add(department2);

        college2.add(department3);

        university.add(college1);
        university.add(college2);

        university.print();
    }
}
