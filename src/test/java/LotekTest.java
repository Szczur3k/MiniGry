import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;

public class LotekTest {

    @BeforeEach
    public static void initClassLotek() {
        Lotek lotek = new Lotek();

    }

    @Test
    public void shouldReturnCorrectNumbers() {

        //Given
        initClassLotek();
        //When
        List<Integer> userNumber = Arrays.asList(11,49,5,91,20,72);
        List<Integer> randomNumberOfSystem = Arrays.asList(11, 49, 5, 91, 20, 72);
        Lotek lotek = new Lotek();
        lotek.ifUserWin();

        //Then
//        assertThat(userNumber).isEqualTo()


    }
}
