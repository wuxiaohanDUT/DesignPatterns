package StrategyPattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] argc){
        CashContext context=new CashContext();
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("请输入折扣策略（1/2/3）：");
        n=scanner.nextInt();
        switch (n){
            case 1:context.setCashStrategy(new NormalStrategy());break;
            case 2:context.setCashStrategy(new RebateStrategy(0.8));break;
            case 3:context.setCashStrategy(new RetrunStategy(100,20));break;
            default:break;
        }
        double money;
        System.out.print("请输入总价格：");
        money=scanner.nextDouble();
        money=context.getCash(money);
        System.out.println("总共需要付："+money+"元");
    }
}
