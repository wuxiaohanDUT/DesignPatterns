package ProxyPattern.DynamicProxy;

import ProxyPattern.DynamicProxy.DynamicProxy;
import ProxyPattern.DynamicProxy.HouseBuyer;
import ProxyPattern.DynamicProxy.buyHouse;

import java.lang.reflect.Proxy;

public class TestMain2 {
    public static void main(String[] argc){
        HouseBuyer hb=new HouseBuyer();
        DynamicProxy dynamicProxy=new DynamicProxy(hb);
        buyHouse housebuy= (buyHouse) Proxy.newProxyInstance(HouseBuyer.class.getClassLoader(),
                new Class[]{buyHouse.class},dynamicProxy); //会动态生成一个类，将调用的方法定位到invoke
        housebuy.buy();
    }
}
