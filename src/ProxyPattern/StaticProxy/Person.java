package ProxyPattern.StaticProxy;

public class Person implements SaySomething{

    @Override
    public void say(String s) {
        System.out.println(s);
    }
}
