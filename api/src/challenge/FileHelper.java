package challenge;

import java.io.FileWriter;
import java.io.IOException;

public class FileHelper {
    public static void saveAddressInJson(String filename, String address) throws IOException {
        FileWriter fileWriter = new FileWriter("%s.json".formatted(filename));
        fileWriter.write(address);
        fileWriter.close();
    }
}
