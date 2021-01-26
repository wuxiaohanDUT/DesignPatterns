package StrategyPattern;

public class RetrunStategy extends CashStrategy{
    private double moneyCodition;
    private double moneyRetrun;

    public RetrunStategy(double c,double r){
        moneyCodition=c;
        moneyRetrun=r;
    }
    @Override
    public double acceptCash(double money) {
        return money-((int)money/moneyCodition)*moneyRetrun;
    }

}
