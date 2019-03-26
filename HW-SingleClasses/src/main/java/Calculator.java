public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addNums(){
        return (this.a + this.b);
    }

    public double subtractNums(){
        return (this.a - this.b);
    }

    public double divNums(){
        return (this.a / this.b);
    }

    public double multNums(){
        return (this.a * this.b);
    }


}
