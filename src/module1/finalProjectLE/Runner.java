package module1.finalProjectLE;



import java.io.IOException;
import java.nio.file.Path;


public class Runner {


    public void run(String[] args) throws IOException {
        FileService fileService = new FileService();
        CaesarCipher cipher = new CaesarCipher();
        BruteForce bruteForce = new BruteForce(cipher);
        //     Command command = getCommand(args);

        if (args.length > 0 && args.length <= 3) {
            switch (args[0]) {
                case "ENCRYPT" ->
                        fileService.writeEncryptedFile(args[1], cipher.encryptFile(fileService.read(Path.of(args[1])), args[2]));
                case "DECRYPT" ->
                        fileService.writeDecryptedFile(args[1], cipher.decryptFile(fileService.read(Path.of(args[1])), args[2]));
                case "BRUTE_FORCE" ->
                        fileService.bruteForced(args[1], bruteForce.atack(fileService.read(Path.of(args[1]))));
            }
        } else {
            System.out.println("Invalid number of arguments");
            System.out.println("The number of arguments must be 3 for operations ENCRYPT, DECRYPT");
            System.out.println("The number of arguments must be 2 for operation BRUTE_FORCE");
        }
    }
}

