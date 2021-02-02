package ProxyPattern.DynamicProxy;

public class HouseBuyer implements buyHouse{

    @Override
    public void buy() {
        System.out.println("buy a house");
    }
}
