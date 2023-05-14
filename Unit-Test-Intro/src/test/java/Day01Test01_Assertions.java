import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test01_Assertions {
    @Test
    public void test(){
    //main methodu yok iken nasil calisti
   //Junit icinde main methodu cagriliyor
   //class bos oldugu icin test gecti

    }
    @Test
    public void testLength(){
        String cumle="Merhaba Evren";//13 karakter
        int anlikDeger=cumle.length();
        int beklenenDeger=13;
        //assertEquals(beklenenDeger,anlikDeger);//once beklenen deger sonra anlik deger
        //testim hata verdiginde mesaj vermek icin
        assertEquals(beklenenDeger,anlikDeger,"Uzunluklar uyusmadi");//3. parametre mesaj
    }
    //farkli ornek

    @Test
    public void testUpperCase(){
        String anlikDeger="Merhaba".toUpperCase();
        String beklenenDeger="MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"UpperCase methodu duzgun calismiyor");

    }
    //toplama islemini test edelim

    @Test
    public void testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);//addExact 2 parametreleri toplayip donduruyor
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);//degerler esit mi diye kontrol ediyor
                                                //esit ise kod gecer
    }
    //contains() test edelim

@Test
public void testContains(){
    assertEquals(false,"Mirac".contains("z"));
    }
}
