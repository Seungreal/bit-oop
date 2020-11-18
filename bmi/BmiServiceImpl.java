package bmi;

public class BmiServiceImpl implements BmiService{

    @Override
    public double calcBMI(BmiDTO bmi) {
        return (bmi.getWeight()/bmi.getHeight())/bmi.getHeight();
    }
}
