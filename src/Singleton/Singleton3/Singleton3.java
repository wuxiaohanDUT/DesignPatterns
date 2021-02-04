package Singleton.Singleton3;

//双重加锁机制
public class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(singleton3==null){
            synchronized (singleton3){
                if(singleton3==null){
                    singleton3=new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
