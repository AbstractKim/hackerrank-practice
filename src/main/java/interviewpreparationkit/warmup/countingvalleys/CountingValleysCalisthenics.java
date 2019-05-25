package interviewpreparationkit.warmup.countingvalleys;

public class CountingValleysCalisthenics implements CountingValleys{

    /***
     * @Purpose: Applying Calisthenics rules
     *     - One level of indentation per method
     *     - Don't use 'else' keyword
     */

    public int countingValleys(int n, String s) {
        if(n != s.length() || n == 0)
            return 0;

        int valleyCount = 0;
        int curAltitude = 0;
        int prevAltitude = 0;
        for(int i = 0 ; i < n; i++){
            curAltitude = getCurAltitude(i, s, curAltitude);
            valleyCount = isFindValley(curAltitude, prevAltitude)  ? valleyCount + 1 : valleyCount;
            prevAltitude = curAltitude;
        }

        return valleyCount;
    }

    private boolean isFindValley(int curAltitude, int prevAltitude) {
        return prevAltitude < 0 && curAltitude == 0;
    }

    private int getCurAltitude(int i, String s, int curAltitude){
        return (s.charAt(i) == 'U') ? curAltitude + 1 : curAltitude - 1;
    }

}
