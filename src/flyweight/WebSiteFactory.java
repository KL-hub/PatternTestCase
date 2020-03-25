package flyweight;

import java.util.HashMap;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/3/23
 * @Version 1.0
 */
public class WebSiteFactory {
    //集合、充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap < String, ConcreteWebSite>();
    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
