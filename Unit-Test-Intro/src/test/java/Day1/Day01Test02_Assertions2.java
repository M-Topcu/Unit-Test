package Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test02_Assertions2 {

    @Test
    public void testToFindMin(){
        assertTrue(Math.min(5,10)==5); //ici true ise test gecer
        assertFalse(Math.min(5,10)==10);
    }

    //baska bir ornek

    @Test
    public void testArrays(){
        String str="Test islemi cok kolay";
        String [] anlikDizi=str.split(" ");
        String[] beklenenDizi={"Test","islemi" ,"cok" ,"kolay"};
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }
}
