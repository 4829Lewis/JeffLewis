import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Files.*;

public class filename {

        private static Object IOException;

        public static String readFileAsString(String filename) throws IOException {

            System.out.println("Content = " + filename);

            String content = new String(readAllBytes(Paths.get(filename)));

            System.out.println("Content = " + content);

            return content;
        }
    }