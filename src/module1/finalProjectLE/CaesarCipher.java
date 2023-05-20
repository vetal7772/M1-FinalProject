package module1.finalProjectLE;


public class CaesarCipher {

    public CaesarCipher() {
    }

    public CaesarCipher(String type, String key) {
    }

    public CaesarCipher(String content) {
    }

    public String encryptFile(String content, String newKey) {
        int key = Integer.parseInt(newKey);
        char[] textToChar = content.toCharArray();
        StringBuilder builder = new StringBuilder();
        String result = "";
        for (char symbol : textToChar) {
            char encrSymbol = encryptSymbol(symbol, key);

            builder.append(encrSymbol);
            System.out.print(encrSymbol);
            result = builder.toString();

        }
        return result;
    }

    public char encryptSymbol(char symbol, int key) {
        char newSymbol = 0;

        if (Constants.ALPHABET_EN.contains(symbol)) {

            int symbIndex = Constants.ALPHABET_EN.indexOf(symbol);
            newSymbol = Constants.ALPHABET_EN.get((symbIndex + key) % 64);
        } else if (Constants.ALPHABET_UA.contains(symbol)) {
            int symbIndex = Constants.ALPHABET_UA.indexOf(symbol);
            newSymbol = Constants.ALPHABET_UA.get((symbIndex + key) % 64);
        }
//        else if (Constants.PUNCTUATION.contains(symbol)) {
//            int symbIndex = Constants.PUNCTUATION.indexOf(symbol);
//            newSymbol = Constants.PUNCTUATION.get((symbIndex + key) % 10);
//        }
        else {
            newSymbol = symbol;
        }

        return newSymbol;
    }


    public String decryptFile(String content, String newKey) {
        int key = Integer.parseInt(newKey);
        char[] textToChar = content.toCharArray();
        StringBuilder builder = new StringBuilder();
        String result = "";
        for (char symbol : textToChar) {
            char encrSymbol = decryptSymbol(symbol, key);

            builder.append(encrSymbol);
            System.out.print(encrSymbol);
            result = builder.toString();

        }
        return result;
    }


    public char decryptSymbol(char symbol, int key) {
        char newSymbol = 0;
        int decryptIndex = 0;
        int symbIndex = 0;
        int newPosition = 0;
        if (Constants.ALPHABET_EN.contains(symbol)) {

            symbIndex = Constants.ALPHABET_EN.indexOf(symbol);
            newPosition = (symbIndex - key) % 64;
            if (newPosition < 0) {
                newPosition = Constants.ALPHABET_EN.size() + newPosition;
                newSymbol = Constants.ALPHABET_EN.get((newPosition));
            } else {
                newSymbol = Constants.ALPHABET_EN.get((newPosition));
            }
            return newSymbol;

        } else if (Constants.ALPHABET_UA.contains(symbol)) {

            symbIndex = Constants.ALPHABET_UA.indexOf(symbol);
            newPosition = (symbIndex - key) % 64;
            if (newPosition < 0) {
                newPosition = Constants.ALPHABET_UA.size() + newPosition;
                newSymbol = Constants.ALPHABET_UA.get((newPosition));
            } else {
                newSymbol = Constants.ALPHABET_UA.get((newPosition));
            }
            return newSymbol;
        } else {
            newSymbol = symbol;
        }
        return newSymbol;
    }
}

//        if (Constants.PUNCTUATION.contains(symbol)) {
//            ArrayList<Character> newPunct = new ArrayList<>(Constants.PUNCTUATION); // зсунути на key позицій
//            symbIndex = Constants.PUNCTUATION.indexOf(symbol);
//            Collections.rotate(newPunct, key);
//
//
//            newSymbol = newPunct.get(symbIndex);
//
//


