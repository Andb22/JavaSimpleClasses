public class Calculator {

    private int num1;
    private int num2;
//    private double dnum1;
//    private double dnum2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }


    public int addNumbers(){
        return (num1 + num2);
    }

    public int subtractNumbers(){
        return (num1 - num2);
    }

    public int multiplyNumbers(){
        return (num1 * num2);
    }

    public double divideNumbers(){
        double dnum1 = num1;
        double dnum2 = num2;
        return (dnum1 / dnum2);
    }
}
