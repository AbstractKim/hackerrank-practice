package interviewpreparationkit.warmup.jumpingontheclouds;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnCloud(){
        int[] c = new int[] {0,0,1,0,0,1,0};
        JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheCloudsBruteForce();
        int minJumps = jumpingOnTheClouds.jumpingOnCoulds(c);
        assertThat(minJumps).isEqualTo(4);

    }

}