package ProxyPattern.StaticProxy;

public class SayProxy implements SaySomething{

    SaySomething person;

    public SayProxy(SaySomething person){
        this.person=person;
    }

    @Override
    public void say(String s) {
        System.out.println("say:");
        person.say(s);
    }
}
