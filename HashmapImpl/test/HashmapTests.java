import HashmapImpl.src.Hashmap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapTests {

    static Hashmap<Integer, String> hashmap;

    @BeforeAll
    public static void beforeConditions() {
        hashmap = new Hashmap<Integer, String>();

        hashmap.put(0, "ZERO");
        hashmap.put(1, "ONE");
        hashmap.put(2, "TWO");
        hashmap.put(3, "THREE");
        hashmap.put(4, "FOUR");
        hashmap.put(5, "FIVE");
        hashmap.put(6, "SIX");
        hashmap.put(7, "SEVEN");
        hashmap.put(8, "EIGHT");
        hashmap.put(9, "NINE");
        hashmap.put(10, "TEN");
        hashmap.put(11, "ELEVEN");
        hashmap.put(12, "TWELVE");
        hashmap.put(13, "THIRTEEN");
        hashmap.put(14, "FOURTEEN");
        hashmap.put(15, "FIFTEEN");
        hashmap.put(16, "SIXTEEN");
        hashmap.put(17, "SEVENTEEN");
        hashmap.put(18, "EIGHTEEN");
        hashmap.put(19, "NINETEEN");
        hashmap.put(20, "TWENTY");
        hashmap.put(21, "TWENTY-ONE");
        hashmap.put(22, "TWENTY-TWO");
        hashmap.put(23, "TWENTY-THREE");
        hashmap.put(24, "TWENTY-FOUR");
        hashmap.put(25, "TWENTY-FIVE");
        hashmap.put(26, "TWENTY-SIX");
        hashmap.put(27, "TWENTY-SEVEN");
        hashmap.put(28, "TWENTY-EIGHT");
        hashmap.put(29, "TWENTY-NINE");
        hashmap.put(30, "THIRTY");
        hashmap.put(31, "THIRTY-ONE");
        hashmap.put(32, "THIRTY-TWO");
        hashmap.put(33, "THIRTY-THREE");
        hashmap.put(34, "THIRTY-FOUR");
        hashmap.put(35, "THIRTY-FIVE");
        hashmap.put(36, "THIRTY-SIX");
        hashmap.put(37, "THIRTY-SEVEN");
        hashmap.put(38, "THIRTY-EIGHT");
        hashmap.put(39, "THIRTY-NINE");
        hashmap.put(40, "FORTY");
        hashmap.put(41, "FORTY-ONE");
        hashmap.put(42, "FORTY-TWO");
        hashmap.put(43, "FORTY-THREE");
        hashmap.put(44, "FORTY-FOUR");
        hashmap.put(45, "FORTY-FIVE");
        hashmap.put(46, "FORTY-SIX");
        hashmap.put(47, "FORTY-SEVEN");
        hashmap.put(48, "FORTY-EIGHT");
        hashmap.put(49, "FORTY-NINE");
        hashmap.put(50, "FIFTY");
    }

    @Test
    public void testPuts() {
        assertEquals("ZERO", hashmap.get(0));
        assertEquals("FORTY-FOUR", hashmap.get(44));
        assertEquals("FORTY-EIGHT", hashmap.get(48));
    }

    @ParameterizedTest
    @CsvSource({
            "0, ZERO",
            "1, ONE",
            "2, TWO",
            "3, THREE",
            "4, FOUR",
            "5, FIVE",
            "6, SIX",
            "7, SEVEN",
            "8, EIGHT",
            "9, NINE",
            "10, TEN",
            "11, ELEVEN",
            "12, TWELVE",
            "13, THIRTEEN",
            "14, FOURTEEN",
            "15, FIFTEEN",
            "16, SIXTEEN",
            "17, SEVENTEEN",
            "18, EIGHTEEN",
            "19, NINETEEN",
            "20, TWENTY",
            "21, TWENTY-ONE",
            "22, TWENTY-TWO",
            "23, TWENTY-THREE",
            "24, TWENTY-FOUR",
            "25, TWENTY-FIVE",
            "26, TWENTY-SIX",
            "27, TWENTY-SEVEN",
            "28, TWENTY-EIGHT",
            "29, TWENTY-NINE",
            "30, THIRTY",
            "31, THIRTY-ONE",
            "32, THIRTY-TWO",
            "33, THIRTY-THREE",
            "34, THIRTY-FOUR",
            "35, THIRTY-FIVE",
            "36, THIRTY-SIX",
            "37, THIRTY-SEVEN",
            "38, THIRTY-EIGHT",
            "39, THIRTY-NINE",
            "40, FORTY",
            "41, FORTY-ONE",
            "42, FORTY-TWO",
            "43, FORTY-THREE",
            "44, FORTY-FOUR",
            "45, FORTY-FIVE",
            "46, FORTY-SIX",
            "47, FORTY-SEVEN",
            "48, FORTY-EIGHT",
            "49, FORTY-NINE",
            "50, FIFTY"
    })
    public void allValuesTest(Integer i, String val) {
        assertEquals(val, hashmap.get(i));
    }

}
