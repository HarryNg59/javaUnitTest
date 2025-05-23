public class Calculator {
    private int a;
    private int b;
    
    public Calculator() {
    }


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Sum(){
        return a+b;
    }

    public int Multi(){
        return a*b;
    }
}
