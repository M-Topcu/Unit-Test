package Day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {
    // hizi test eder

    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(3),() ->{
            IntStream.rangeClosed(1,1000000).forEach(System.out::println);
        });
    }

    // genellikle sinsuz loopa girme ihtimali olan looplarda kullanilir.
    // burda 3 sn de gecemezse fail edip durduruyor
}
