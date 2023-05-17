package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {

    // test ettigimiz methodun bekledigimiz exc firlatip fitlatmadigini test edecegiz

    @Test
    void testException(){
        String str = "Merhaba Dunya";
        assertThrows(NullPointerException.class, ()->{
            System.out.println("testException is run");
            str.length();
        });
    } //gecmedi

    //bolme islemi icin exception kontrolu
    @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }//gecti

    // yukaridaki soruyu method ekleyerek yeniden yapalim
    @Test
    void testException3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class, ()->{
            divide(sayi1, sayi2); // divide methodunu test etmis olduk
        });
    }

    private int divide(int a, int b) {
        return a/b;
    }


}
