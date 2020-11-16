package day04;

class Calculator {
    int number1;
    int number2;
    String operator;
    
    void setNumber1(int number) {
        number1=number;
    }
    
    int getNumber1() {
        return number1;
    }
    
    void setNumber2(int number) {
        number2=number;
    }
    
    int getNumber2() {
        return number2;
    }
    
    void setOperator(String operator) {
        this.operator=operator;
    }
    
    String getOperator() {
        return operator;
    }
    
    // int + int 를 하는
    // add 메소드
    int add(int a, int b) {
        return a+b;
    }

    // -: subtract
    int subtract(int a, int b) {
        return a - b;
    }

    // *: multiply
    int multiply(int a, int b) {
        return a * b;
    }

    // /: divide
    double divide(int a, int b) {
        return (double) a / b;
    }
}
