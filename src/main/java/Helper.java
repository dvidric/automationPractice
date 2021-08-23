import org.apache.commons.lang3.RandomStringUtils;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Helper {

    public Helper() throws IOException {
    }

    public static void writeArrayStringsToFile(ArrayList<String> list) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        for (String item : list) {
            writer.write(item + "\n");
        }
        writer.flush();
        writer.close();
    }

    public static String generateEmail(){
        String r = RandomStringUtils.randomAlphanumeric(5);
        String email =  r+"@gmail.com";
        return email;
    }
}
