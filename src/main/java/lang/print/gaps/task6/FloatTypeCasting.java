package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        if (numberToBeRounded-(int)numberToBeRounded<0.5){
            System.out.println((int) numberToBeRounded);
        }else{
            System.out.println((int)numberToBeRounded+1);
        }
    }
}
