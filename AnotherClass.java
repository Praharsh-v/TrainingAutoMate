public class AnotherClass
{
    private double FirstNumber;
    private double SecondNumber;
    private int addition;
    private int multiplication;
    private int Division;

    public void setFirstNumber(double firstNumber) {
       this.FirstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.SecondNumber=secondNumber;
    }

    public double getFirstNumber() {
        return FirstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public int getAddition() {
        addition= (int) (getFirstNumber()+getSecondNumber());
        return addition;
    }

    public int getMultiplication() {
        multiplication= (int) (getFirstNumber()*getSecondNumber());
        return multiplication;
    }

    public int getDivision() {
        Division= (int) (getFirstNumber()/getSecondNumber());
        return Division;
    }
}
