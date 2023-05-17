package Day3;

import org.junit.jupiter.api.Test;

public class C01_StringModify {
    //Task : kelimenin ilk 2 harfinde A varsa silinsin
    // kelime icindeki harflerin hepsi buyuk olacak.
    // AABC -> BC

    public String deleteAIfItIsInFirstTwoPosition(String str){
        if(str.length()<=2){
            return str.replace("A","");
        }

        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);

        return firstTwoChars.replaceAll("A","")+afterFirstTwoChars;
    }

}
