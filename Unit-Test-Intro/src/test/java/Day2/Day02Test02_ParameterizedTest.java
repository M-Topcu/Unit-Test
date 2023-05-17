package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {

    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Tarik".length()>0);
        assertTrue("Ismail".length()>0);
        assertTrue("Taha".length()>0);
    }

    // yukardaki methodu daha kolay yazmak icin parametreli testler kullaniriz
    @ParameterizedTest
    @ValueSource(strings={"mirac", "tarik", "ismail", "Taha"})
    void testLengthParameter(String str){
        assertTrue(str.length()>0);
    }

    //2. ornek
    @ParameterizedTest
    @CsvSource(value=
            {
                    "MERHABA, merhaba",
                    "JAVA, java",
                    "TEST, test"
            })
    void testUpperCase(String str1, String str2){
        assertEquals(str1, str2.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value={"true, java, a", "true, junit, u", "false, hello, a"})
    void testContains(boolean b, String str2, String str3){
        assertEquals(b, str2.contains(str3));
    }
}
