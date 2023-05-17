package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test05_GroupingTest {

    // Amacimiz birbiriyle iliskili testeri gruplamak.
    // Ayni sinifin icinde 2 parametreli test yazarak gruplamak istiyoruz :

    @Nested
    class MultiplyTest{
        @ParameterizedTest
        @CsvSource(value={"-12,-4,3", "-12,4,-3", "12,-4,-3"})
        void testMultiplyWithNonZero(int rs, int x, int y){
            assertEquals(rs,Math.multiplyExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value={"0,-4,0", "0,4,0", "0,0,4"})
        void testMultiplyWithZero(int rs, int x, int y){
            assertEquals(rs,Math.multiplyExact(x,y));
        }
    }
    // 1. grup testin sonu

    @Nested
    class AddTest{
        @ParameterizedTest
        @CsvSource(value={"-1,-4,3", "1,4,-3", "-7,-4,-3"})
        void testAddWithNonZero(int rs, int x, int y){
            assertEquals(rs,Math.addExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value={"9,0,9", "4,4,0", "4,0,4"})
        void testAddWithZero(int rs, int x, int y){
            assertEquals(rs,Math.addExact(x,y));
        }
    }
    // 2. grup testin sonu
}
