import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;

public class LotekTest {

    //TODO try implement Test for correctness of given number by user

    @Test
    public void shouldReturnCorrectNumbers() {

        //Given
        Lotek lotek = new Lotek();

        //When
        List<Integer> userNumber = Arrays.asList(11,49,5,91,20,72);
//        lotek.checkIfUserWin();
//        lotek.randomNumberBySystem();

        //Then
//        assertThat(userNumber).isEqualTo()


    }
}
