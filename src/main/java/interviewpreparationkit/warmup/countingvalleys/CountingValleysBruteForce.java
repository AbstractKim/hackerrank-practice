package interviewpreparationkit.warmup.countingvalleys;

public class CountingValleysBruteForce implements CountingValleys {
    public int countingValleys(int n, String s) {
        if(n != s.length() || n == 0)
            return 0;

        int valleyCount = 0;
        boolean isStartedValley = false;
        int altitude = 0;
        //calculate valley's count --> how?? what is definition of valley.
        //step down from sea level --> Down and altitude = -1
        //step up from sea level --> Up and altitude = 0
        for(int i = 0 ; i < n; i++){
            if(s.charAt(i)== 'U')
                altitude++;
            else
                altitude--;
            if(!isStartedValley && altitude < 0)
                isStartedValley = true;
            if(isStartedValley && altitude >= 0){
                isStartedValley = false;
                valleyCount++;
            }
        }
        return valleyCount;
    }
}
