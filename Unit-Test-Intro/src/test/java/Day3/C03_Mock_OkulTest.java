package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C03_Mock_OkulTest {

    @Test
    void islemlerTest(){
        C03_Mock_Islemler dummyObject = Mockito.mock(C03_Mock_Islemler.class);
        dummyObject.ekleOgrenci("asdf");
        dummyObject.silOgrenci("asddf");
        dummyObject.guncelleOgrenci("asdf");
        //methodlar cagirilmis mi kontrol edelim
        verify(dummyObject).ekleOgrenci("asdf");
        verify(dummyObject).silOgrenci("asddf");
        verify(dummyObject).guncelleOgrenci("asdf");
    }

    // method kac kere cagirilmis test edelim
    @Test
    void testKacKereCagirildi(){
        C03_Mock_Islemler dummyObject = Mockito.mock(C03_Mock_Islemler.class);
        dummyObject.ekleOgrenci("asdf");
        dummyObject.ekleOgrenci("asdf");
        dummyObject.ekleOgrenci("asdfg");

        // acaba asdf parametresi ile ekleOgrenci() methodu 2 defa cagirildi mi
        verify(dummyObject,times(2)).ekleOgrenci("asdf");

        // ekleOgrenci() methodunun asdfff ile cagirilip cagirilmadigina bakalim
        verify(dummyObject,times(0)).ekleOgrenci("asdfff");

        //methodun hic cagirilmadigini test etmek
        verify(dummyObject,never()).silOgrenci(anyString()); // herhangi bir parametre girsek fark etmezdi

        // methodun en az 2 kere cagirildigini test etmek
        verify(dummyObject,atLeast(2)).ekleOgrenci("asdf"); //atMost da var
    }

    // methodlarin cagirilma sirasini test etmek istersem
    @Test
    void testSiralama(){
        C03_Mock_Islemler dummyObj = Mockito.mock(C03_Mock_Islemler.class);

        dummyObj.ekleOgrenci("Ahmet");
        dummyObj.ekleOgrenci("Mehmet");
        dummyObj.silOgrenci("Ahmet");

        // once eklenmis olmasi lazim ki silebilelim. bunu test etcez
        InOrder inOrder = inOrder(dummyObj);
        inOrder.verify(dummyObj).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObj).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObj).silOgrenci("Ahmet");


    }
}
