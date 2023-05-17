package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {
    // herhangi bir testi tekrarlatmak istersem

    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("Test calisti");
    }

    // 2. ornek
    @Disabled // class`i run edince bunu atlar
    @RepeatedTest(3)
    void testRepeat(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("test calisti");
    }

    // 3. ornek
    Random rand = new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1=rand.nextInt(10);
        int sayi2=rand.nextInt(10);

        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 = "+ sayi1 + ", sayi2 = "+ sayi2);
    }

}
