package interviewpreparationkit.warmup.jumpingontheclouds;

public class JumpingOnTheCloudsBruteForce implements JumpingOnTheClouds {
    public int jumpingOnCoulds(int[] c) {
        int length = c.length;
        int minJump = 0;
        for(int i = 0; i < length;){
            if((i+2) < length && c[i+2] == 0){
                minJump++;
                i = i + 2;
            }else if( (i+1) < length && c[i+1] == 0 ){
                minJump++;
                i = i + 1;
            }else {
                i++;
            }
        }
        return minJump;
    }
}
