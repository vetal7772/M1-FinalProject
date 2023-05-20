package module1.finalProjectLE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BruteForce {
    public BruteForce(CaesarCipher cipher) {
    }


    public String atack(String content) {
        CaesarCipher cipher = new CaesarCipher(content);
        int key = 0;
        String result = "";
        char[] textToChar = content.toCharArray();
        for (key = 1; key < 200; key++) {

            StringBuilder builder = new StringBuilder();

            for (char symbol : textToChar) {

                char encrSymbol = cipher.decryptSymbol(symbol, key);

                builder.append(encrSymbol);
                System.out.print(encrSymbol);
                result = builder.toString();
            }
            int coincidence = 0;
            // Pattern pattern = Pattern.compile(result);
            //    if ( Pattern.matches("[a-zA-Z]+ [a-zA-Z]+", result))
            // ||result.matches("[a-zA-Z]\\W [a-zA-Z]")||result.matches("[a-zA-Z]. [a-zA-Z]")){

            Pattern pattern = Pattern.compile("[a-zA-Z]+ [a-zA-Z]+");

            Matcher matcher = pattern.matcher(result);
            while (matcher.find()) {
                coincidence++;
            }
            if (coincidence > 1) {
                System.out.println("Key is :" + key);
                System.out.println("coincidence :" + coincidence);
                return result;
            }
        }
        return result;

    }
}

