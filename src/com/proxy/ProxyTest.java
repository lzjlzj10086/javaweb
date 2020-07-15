package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理：可以增强参数，返回值
 */
public class ProxyTest {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        sale o = (sale)Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
                if (method.getName().equals("saleComputer")){
                    int money = (int) args[0];
                    String str = (String) method.invoke(lenovo, money-1000);
                    return str+"_鼠标";
                }else {
                    method.invoke(lenovo);
                    return null;
                }
            }
        });
        String string = o.saleComputer(8526);
        System.out.println(string);
        o.show();
    }
}
