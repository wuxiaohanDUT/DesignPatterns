package ProxyPattern.StaticProxy;

import ProxyPattern.StaticProxy.Person;
import ProxyPattern.StaticProxy.SayProxy;
import ProxyPattern.StaticProxy.SaySomething;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] argc){
        SayProxy proxy=new SayProxy(new Person());
        proxy.say("hello");
    }
}
