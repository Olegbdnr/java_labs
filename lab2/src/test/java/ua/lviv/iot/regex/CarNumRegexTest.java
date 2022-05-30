package ua.lviv.iot.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.regex.carNumber.CarNumRegex;

public class CarNumRegexTest {
    @Test
    public void replacingCarNumsTest() {
        CarNumRegex regex = new CarNumRegex();
        String text = "413-12 FF fasfaf AA4132BX fsdfsdfa AA 5321 BC";
        String expected = "CAR NUMBER fasfaf CAR NUMBER fsdfsdfa CAR NUMBER";
        String result = regex.replaceCarNums(text);
        Assertions.assertTrue(expected.equals(result));
    }
}
