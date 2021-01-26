package StrategyPattern;

public class CashContext {
    private CashStrategy cashStrategy;
    public double getCash(double money){
        return cashStrategy.acceptCash(money);
    }
    public void setCashStrategy(CashStrategy cashStrategy){
        this.cashStrategy=cashStrategy;
    }
}
