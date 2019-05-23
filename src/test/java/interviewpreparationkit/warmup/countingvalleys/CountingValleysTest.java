package interviewpreparationkit.warmup.countingvalleys;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CountingValleysTest {

    @Test
    public void countingValleys() {
        //given
        int n = 8;
        String s = "UDDDUDUU";

        //when
        int result = CountingValleys.countingValleys(n, s);
        assertThat(result).isEqualTo(1);
    }
}