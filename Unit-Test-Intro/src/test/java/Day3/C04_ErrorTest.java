package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C04_ErrorTest {

    @Test
    void test(){
        C04_Error obj = Mockito.mock(C04_Error.class);
        obj.divide(5,0); // exc vermez cunku method calismaz sadece cagirilir
    }
}
