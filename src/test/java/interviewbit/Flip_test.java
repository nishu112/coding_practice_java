package interviewbit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Flip_test {

    private Flip flip = new Flip();

    @Test
    public void FLIP_SAMPLE1() {
        String A = "010";

        Assertions.assertEquals(new ArrayList<Integer>() {{
            add(1);
            add(1);
        }}, flip.flip(A));
    }


    @Test
    public void FLIP_SAMPLE2() {
        String A = "111";

        Assertions.assertEquals(new ArrayList<Integer>() {{

        }}, flip.flip(A));
    }


}
