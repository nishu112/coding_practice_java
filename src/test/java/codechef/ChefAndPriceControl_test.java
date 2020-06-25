package codechef;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ChefAndPriceControl_test {


    /*

    3
    5 4
    10 2 3 4 5
    7 15
    1 2 3 4 5 6 7
    5 5
    10 9 8 7 6
     */
    @Test
    public void testMain() throws IOException,Exception {
        System.out.println("main");
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File("[path_to_file]"));
        System.setIn(fips);
        ChefAndPriceControl.main(args);
        System.setIn(original);
    }
}
