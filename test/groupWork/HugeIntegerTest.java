package groupWork;


import com.timmy.exercise8_18.groupWork.DigitLenghtException;
import com.timmy.exercise8_18.groupWork.HugeInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    private HugeInteger hugeInteger;
    private HugeInteger hugeInteger1;
    private HugeInteger hugeInteger2;
    @BeforeEach
    void setup(){
        hugeInteger = new HugeInteger();
        hugeInteger1 = new HugeInteger();
        hugeInteger2 = new HugeInteger();

    }
    @Test
    void testThatIntArrayCanBePopulated(){
        //given we have a hugeInteger
        //when we invoke parse method
        //assert that intArray is populated
        var numbers = hugeInteger.getNumbers();
        assertEquals(0, numbers[0]);
        assertEquals(0, numbers[4]);
        hugeInteger.parse("12345");
        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
        assertEquals(3, numbers[2]);
        assertEquals(4, numbers[3]);
        assertEquals(5, numbers[4]);
    }
    @Test
    void testThatIfArgumentFromMethodParseContainsLetterAnExceptionIsThrown(){
        assertThrows(NumberFormatException.class, ()-> hugeInteger.parse("1ab45"));
    }
@Test
    void testThatIfDigitLenghtExceedFortyAnExceptionIsThrown(){
        assertThrows(DigitLenghtException.class, ()-> hugeInteger.parse("4656556558333333333331212334455623442678986432345678980643211"));
}
@Test
    void testThatEachCorrespondingIndexOfTheObjectCanBeAdded(){
        hugeInteger1.parse("2334");
        hugeInteger2.parse("5658");
        HugeInteger sum = hugeInteger.addHugeInteger(hugeInteger1, hugeInteger2);
        var numbers = sum.getNumbers();
        assertEquals(7, numbers[0]);
    }
    @Test
    void testThatEachCorrespondingIndexOfTheObjectCanBesubtracted(){
        hugeInteger1.parse("2334");
        hugeInteger2.parse("5658");
        HugeInteger subt = hugeInteger.subtractHugeInteger(hugeInteger1, hugeInteger2);
        var numbers = subt.getNumbers();
        assertEquals(-3, numbers[0]);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsGreaterThanHugeInteger(){
        //Given that we have 2 hugeInteger
        //when greater than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("34567899");
        hugeInteger2.parse("11123456");
        boolean greater = HugeInteger.greaterThan(hugeInteger1,hugeInteger2);
        assertTrue(greater);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsLessThanHugeInteger2(){
        //Given that we have 2 hugeInteger
        //when greater than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("11123456");
        hugeInteger2.parse("34567899");
        boolean less = HugeInteger.lessThan(hugeInteger1,hugeInteger2);
        assertTrue(less);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsEqualHugeInteger2(){
        //Given that we have 2 hugeInteger
        //when greater than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("34567899");
        hugeInteger2.parse("34567899");
        boolean equal = HugeInteger.isEqual(hugeInteger1,hugeInteger2);
        assertTrue(equal);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsNotEqualHugeInteger2(){
        //Given that we have 2 hugeInteger
        //when isNotEqual than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("34567899");
        hugeInteger2.parse("34567829");
        boolean equal = HugeInteger.isNotEqual(hugeInteger1,hugeInteger2);
        assertTrue(equal);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsGreaterThanOrEqualHugeInteger2(){
        //Given that we have 2 hugeInteger
        //when isNotEqual than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("34567899");
        hugeInteger2.parse("34567829");
        boolean greaterOrEqual = HugeInteger.isGreaterThanOrEqualTo(hugeInteger1,hugeInteger2);
        assertTrue(greaterOrEqual);
    }
    @Test
    void testThatTrueIsReturnedIfHugeInteger1IsLessThanOrEqualHugeInteger2(){
        //Given that we have 2 hugeInteger
        //when islessThanOrEqualTo than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("34567821");
        hugeInteger2.parse("34567829");
        boolean lessOrEqual = HugeInteger.islessThanOrEqualTo(hugeInteger1,hugeInteger2);
        assertTrue(lessOrEqual);
    }
    @Test
    void testThatTrueIsReturnedIfHugeIntegerIsZero(){
        //Given that we have 2 hugeInteger
        //when islessThanOrEqualTo than method is invoked
        //assertTrue that true is returned if hugeInteger1 Is GreaterThan HugeInteger2
        hugeInteger1.parse("000000");
        boolean result= HugeInteger.isZero(hugeInteger);
        assertTrue(result);
    }

}