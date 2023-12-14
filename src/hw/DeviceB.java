package hw;
public class DeviceB implements CalcResault{

    double coef = COEF;
    public double calcResault(double num1, double num2) {
        return (num1 + num2) * coef;
    }
}