package CalcOOP;

public class Numbers {
    private double firstNumber;
    private double secondNumber;

/// Конструктор для ввода чисел

    public Numbers(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

/// Геттеры, сеттеры

    public double getFirstNumber() {

        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

/// Типы операций

    public double getPlus() {
        double plus = this.firstNumber + this.secondNumber;
        return plus;
    }

    public double getMinus() {
        double minus = this.firstNumber - this.secondNumber;
        return minus;
    }

    public double getMultipltcation() {
        double multipltcation = this.firstNumber * this.secondNumber;
        return multipltcation;
    }

    public double getDivide() throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("ArithmeticException: на ноль делить нельзя");
        }
       return  this.firstNumber / this.secondNumber;
    }

}