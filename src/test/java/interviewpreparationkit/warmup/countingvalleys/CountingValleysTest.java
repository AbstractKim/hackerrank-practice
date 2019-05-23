package interviewpreparationkit.warmup.countingvalleys;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CountingValleysTest {

    @Test
    public void countingValleys() {
        //given
        int n = 8;
        String s = "UDDDUDUU";

        CountingValleys countingValleys = new CountingValleysBruteForce();

        //when
        int result = countingValleys.countingValleys(n, s);

        //then
        assertThat(result).isEqualTo(1);
    }
}