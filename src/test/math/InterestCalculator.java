package math;

/**
 * Created by rajatbhatnagar on 1/19/16.
 */
public interface InterestCalculator {
    void setRate(double rate);
    double calculate(double amount , double year);
    double subtract(double value1, double value2);
}
