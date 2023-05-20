package module1.finalProjectLE;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
    public static final ArrayList<Character> ALPHABET_UA = new ArrayList<>(Arrays.asList(
            'а','б','в','г','д','е','є','ж','з','и','і',
            'ї','й','к','л','м','н','о','п','р','с','т',   //64
            'у','ф','х','ц','ч','ш','щ','ь','ю','я',
            'А','Б','В','Г','Д','Е','Є','Ж','З','И','І',
            'Ї','Й','К','Л','М','Н','О','П','Р','С','Т',
            'У','Ф','Х','Ц','Ч','Ш','Щ','Ь','Ю','Я'

    ));

public static final ArrayList<Character> ALPHABET_EN = new ArrayList<>(Arrays.asList(
        '@','a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','o','p','r','s','t','u','v','w',
        'x','y','z', 'A','B','C','D','E','F','G','H','I','J','K',
        'L','M','N','O','P','R','S','T','U','V','W',
        'X','Y','Z',' ','.',',','«', '»', '\'', ':', '"', '?','"','#','$','%'            //64
    ));

//public static final ArrayList<Character> PUNCTUATION = new ArrayList<>(Arrays.asList(
//        ' ','.',',','«', '»', '"', '\'', ':', '!', '?'
//));

public final String ENCRYPT_MENU = "\n Enter path to file to encrypt";
public final String DECRYPT_MENU = "\n Enter path to file to decrypt";
public final String INPUT_KEY = "\n Enter cipher key";
public final String FILE_SAVED = "\n Enter path to file to encrypt";
public final String WRONG_ACTION = "\n Wrong input, please type number between 1 and 3";
}
