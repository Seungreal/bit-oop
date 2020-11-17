package calculator;

public class CalculatorDTO {
    int num1;
    int num2;
    int result;
    String opcode;
    
    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getResult() {
        return result;
    }
    
    public void setResult(int result) {
        this.result = result;
    }
    
    public String getOpcode() {
        return opcode;
    }
    
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }   
}
