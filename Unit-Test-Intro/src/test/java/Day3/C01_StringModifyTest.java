package Day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {
    C01_StringModify obj;

    @BeforeEach
    void setUp(){
        obj= new C01_StringModify();
        System.out.println("BeforeEach calisti");
    }

    @AfterEach
    void tearDown(){
        obj=null;
        System.out.println("AfterEach calisti");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC", "BC, ABC", "BC, BAC"})
    void deleteAIfItIsInFirstTwoPositionTest(String rs, String str1){
        assertEquals(rs,obj.deleteAIfItIsInFirstTwoPosition(str1));
    }
}
