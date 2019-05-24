package interviewpreparationkit.warmup.countingvalleys;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CountingValleysTest {

    @Test
    public void countingValleys() {
        //given
        int n = 8;
        String s = "UDDDUDUU";

//        CountingValleys countingValleys = new CountingValleysBruteForce();
        CountingValleys countingValleys = new CountingValleysCalisthenics();

        //when
        int result = countingValleys.countingValleys(n, s);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test(){
        for (int i = 0 ; i < 10 ; i++){
            if(i == 5)
                continue;
            System.out.println(i);

        }
    }
}