package calculator;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(CalculatorDTO calc) {
        return calc.getNum1()+calc.getNum2();
    }

    @Override
    public int sub(CalculatorDTO calc) {
        return calc.getNum1()-calc.getNum2();
    }

    @Override
    public int mul(CalculatorDTO calc) {
        return calc.getNum1()*calc.getNum2();
    }

    @Override
    public int div(CalculatorDTO calc) {
        return calc.getNum1()/calc.getNum2();
    }

    @Override
    public int mod(CalculatorDTO calc) {
        return calc.getNum1()%calc.getNum2();
    }

}
