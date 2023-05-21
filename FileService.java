package module1.finalProjectLE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public boolean isFileExists(Path filepath) {
        return Files.exists(filepath);
    }

    public String read(Path filePath) throws IOException {
        if (!isFileExists(filePath)) {
            System.out.println("File does not exists");
        } else {
           String src = new String(Files.readAllBytes(filePath));
            return src;
        }
        return "";
    }

    public void writeEncryptedFile(String filePath, String text) throws IOException {
        writeFile(filePath, text, "[ENCRYPTED]");
    }


    public void writeFile(String filePath, String fileContent, String status) throws IOException {
        Path path = Paths.get(filePath);

        String fileName = path.getFileName().toString();
        String fileExtension = " ";
        int extensionIndex = fileName.lastIndexOf('.');
        if (extensionIndex > 0) {
            fileExtension = fileName.substring(extensionIndex);
            fileName = fileName.substring(0, extensionIndex);
            String newFileName = fileName + status + fileExtension;
            Path newFilePath = path.resolveSibling(newFileName);
            Files.writeString(newFilePath, fileContent);
        }
    }


    public void writeDecryptedFile(String filePath, String text) throws IOException {
        writeFile(filePath, text, "[DECRYPTED]");
    }

    public void bruteForced(String filePath, String text) throws IOException {
        writeFile(filePath, text, "[BRUTE_FORCE]");
    }
}
