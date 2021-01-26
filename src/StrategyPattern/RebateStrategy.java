package StrategyPattern;

public class RebateStrategy extends CashStrategy {
    private double rate;
    public RebateStrategy(double rate){
        this.rate=rate;
    }
    @Override
    public double acceptCash(double money) {
        return money*rate;
    }
}
