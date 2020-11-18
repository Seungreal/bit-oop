package calculator;

public class CalculatorController {
    public int excute(CalculatorDTO calc) {
        CalculatorService service = new CalculatorServiceImpl();
        int res=0;
        
        switch(calc.getOpcode()) {
        case "+":
            res=service.add(calc);
            break;
        case "-":
            res=service.sub(calc);
            break;
        case "*":
            res=service.mul(calc);
            break;
        case "/":
            res=service.div(calc);
            break;
        case "%":
            res=service.mod(calc);
        }
        
        return res;
    }
}
