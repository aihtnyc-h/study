package day5.solid.LSP;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public String getOperator() {
        return "/";
    }
}