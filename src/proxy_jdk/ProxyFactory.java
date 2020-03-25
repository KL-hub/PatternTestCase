package proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description //动态代理
 * @Author 李项
 * @Date 2020/3/24
 * @Version 1.0
 */
public class ProxyFactory {
    public Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public  Object  getProxy(){
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(target,args);
            }
        });
        return o ;
    }
}
