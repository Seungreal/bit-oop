package day01;

class Main {
    public static void main(String[] args) {
        // int형 변수를 만들어보자
        Variable variable = new Variable();

        // number에 5라는 값을 할당해보자
        variable.setNumber(5);

        // number에 저장된 값을 출력해보자
        System.out.println("number의 현재값: " + variable.getNumber());

        // number에 30이라는 값을 할당해보자
        variable.setNumber(30);
        System.out.println("number의 현재값: " + variable.getNumber());

        Operator operator = new Operator();

        operator.setMyNumber1(10);
        operator.setMyNumber2(15);

        int add = operator.getMyNumber1() + operator.getMyNumber2();
        int sub = operator.getMyNumber1() - operator.getMyNumber2();
        int mul = operator.getMyNumber1() * operator.getMyNumber2();
        int div = operator.getMyNumber1() / operator.getMyNumber2();

        System.out.println("myNumber1 + myNumber2 = " + add);
        System.out.println("myNumber1 - myNumber2 = " + sub);
        System.out.println("myNumber1 * myNumber2 = " + mul);
        System.out.println("myNumber1 / myNumber2 = " + div);
        // 나눗셈의 경우, 정수형과 정수형의 나눗셈은
        // 반드시 결과값이 정수형이 나오게 된다.

        int remain = operator.getMyNumber1() % operator.getMyNumber2();
        System.out.println("myNumber1 % myNumber2= " + remain);

        // 하지만 산술연산의 경우 한쪽이 실수이면
        // 결과값도 실수가 된다.
        double add2 = (double) operator.getMyNumber1() + operator.getMyNumber2();
        double sub2 = (double) operator.getMyNumber1() - operator.getMyNumber2();
        double mul2 = (double) operator.getMyNumber1() * operator.getMyNumber2();
        double div2 = (double) operator.getMyNumber1() / operator.getMyNumber2();
        double remain2 = (double) operator.getMyNumber1() % operator.getMyNumber2();

        System.out.println("myNumber1 + myNumber2 = " + add2);
        System.out.println("myNumber1 - myNumber2 = " + sub2);
        System.out.println("myNumber1 * myNumber2 = " + mul2);
        System.out.println("myNumber1 / myNumber2 = " + div2);
        System.out.println("myNumber1 % myNumber2= " + remain2);

        double result = operator.getMyNumber1() / operator.getMyNumber2();
        System.out.println("result의 현재값: " + result);
        // 위 코드는 0.0이 결과값으로 나오는데
        // myNumber1/myNumber2=
        // int/int기 때문에
        // 몫만 온전하게 나온다

        // String
        // 여러개의 문자를 모아둔 문자열을 관리하는 클래스
        operator.setString1("abc");
        operator.setString2("DEF");
        System.out.println(operator.getString1() + operator.getString2());
        System.out.println("123" + 456);

        // 증감연산자
//        System.out.println("myNumber1의 현재값: " + operator.getMyNumber1());
//        System.out.println("++myNumber1: " + ++operator.getMyNumber1());
//        System.out.println("myNumber1의 현재값: " + operator.getMyNumber1());
//        System.out.println("++myNumber1: " + operator.getMyNumber1()++);
//        System.out.println("myNumber1의 현재값: " + operator.getMyNumber1());
        //해당 구문은 주석처리
        //왜냐하면 getter를 통해 얻어온 값은 상수이기 때문에
        //증감연산자의 피연산자 조건을 만족시키지 못해 에러를 일으킬 것으로 추정
    }
}
