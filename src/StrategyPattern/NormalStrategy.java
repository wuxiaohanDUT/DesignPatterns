package StrategyPattern;

public class NormalStrategy extends CashStrategy{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
