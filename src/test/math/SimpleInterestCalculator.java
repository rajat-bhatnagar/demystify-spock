package math;

/**
 * Created by rajatbhatnagar on 1/19/16.
 */
public class SimpleInterestCalculator implements InterestCalculator {
    private double rate;

    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate(double amount, double year) {
        if(amount<0 || rate<0){
            throw new IllegalArgumentException("Amount or year cannot be less than zero");
        }
        return amount * year * rate;
    }

    @Override
    public double subtract(double value1, double value2) {
        return (value1 - value2);
    }
}
