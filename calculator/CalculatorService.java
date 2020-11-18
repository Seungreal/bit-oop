package calculator;

public interface CalculatorService {
    public int add(CalculatorDTO calc);
    public int sub(CalculatorDTO calc);
    public int mul(CalculatorDTO calc);
    public int div(CalculatorDTO calc);
    public int mod(CalculatorDTO calc);
}
