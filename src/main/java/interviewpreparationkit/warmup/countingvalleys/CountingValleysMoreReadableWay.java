package interviewpreparationkit.warmup.countingvalleys;


public class CountingValleysMoreReadableWay implements CountingValleys {
    int curStep;
    int totalSteps;
    int prevAltitude;
    int curAltitude;
    int countValleys;
    String stepSequences;
    public int countingValleys(int n, String s) {

        initVal(n, s);

        while(canMoveForward()){
            ifFindValleyAddCount();
            moveForward();
        }
        return countValleys;
    }

    private void moveForward() {
        curStep++;
        if( curStep == totalSteps) //to block outOfIndex of stepSequence
            return;
        setAltitudes();
    }

    private void setAltitudes() {
        prevAltitude = curAltitude;
        curAltitude = (stepSequences.charAt(curStep) == 'U') ? curAltitude + 1 : curAltitude - 1;
    }

    private void ifFindValleyAddCount() {
        if(isFindValley())
            countValleys++;
    }

    //key algorithm if prevAltitude < 0 (sea level) && curAltitude == 0, it is value
    private boolean isFindValley() {
        return prevAltitude < 0 && curAltitude == 0;
    }

    private boolean canMoveForward() {
        return curStep < totalSteps;
    }

    private void initVal(int n, String s) {
        if(n != s.length())
            throw new Error("not valid input");
        stepSequences = s;
        curStep = 0;
        totalSteps = n;
        prevAltitude = 0;
        curAltitude = 0;
        countValleys = 0;
        setAltitudes();
    }
}
