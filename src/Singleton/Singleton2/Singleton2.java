package Singleton.Singleton2;

//饿汉式 在类加载时进行初始化
public class Singleton2 {

    private static Singleton2 singleton2=new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton2;
    }
}
