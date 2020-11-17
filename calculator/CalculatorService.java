package calculator;

public class CalculatorService {
    int add(CalculatorDTO calc) {
        return calc.getNum1()+calc.getNum2();
    }
    
    int sub(CalculatorDTO calc) {
        return calc.getNum1()-calc.getNum2();
    }
    
    int mul(CalculatorDTO calc) {
        return calc.getNum1()*calc.getNum2();
    }
    
    int div(CalculatorDTO calc) {
        return calc.getNum1()/calc.getNum2();
    }
    
    int mod(CalculatorDTO calc) {
        return calc.getNum1()%calc.getNum2();
    }
}
