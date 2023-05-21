package module1.finalProjectLE;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    public final String COMMAND = "\n Enter command (ENCRYPT, DECRYPT or BRUTE_FORCE)";
    public final String ENCRYPT_MENU = "\n Enter path to file to encrypt";
    public final String DECRYPT_MENU = "\n Enter path to file to decrypt";
    public final String INPUT_KEY = "\n Enter cipher key";
    public final String FILE_SAVED = "\n Enter path to file to encrypt";
    public final String WRONG_ACTION = "\n Wrong input, please type number between 1 and 3";


    public void getArguments(String[] args) throws IOException {
        args = new String[3];
        Scanner scn = new Scanner(System.in);
        System.out.println(COMMAND);
        args[0] = scn.nextLine();
        System.out.println(ENCRYPT_MENU);
        args[1] = scn.nextLine();
        System.out.println(INPUT_KEY);
        args[2] = scn.nextLine();
        Main.main(args);
    }
}